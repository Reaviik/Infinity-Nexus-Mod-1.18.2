package com.Infinity.Nexus.Mod.command;

import com.mojang.brigadier.Command;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.sun.jdi.CharType;
import net.minecraft.Util;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.Commands;
import net.minecraft.commands.arguments.MessageArgument;
import net.minecraft.network.chat.*;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;

public class ChatItem {
    private static final SimpleCommandExceptionType INVALID_ITEM =
            new SimpleCommandExceptionType(new TranslatableComponent("commands.teleport.invalidPosition"));

    public static void register(CommandDispatcher<CommandSourceStack> dispatcher) {
        dispatcher.register(Commands.literal("hand")
                .then(Commands.argument("mensagem", MessageArgument.message())
                        .executes(ChatItem::execute)));
    }


    private static int execute(CommandContext<CommandSourceStack> command) throws CommandSyntaxException {
        if (command.getSource().getEntity() instanceof Player player) {
            ItemStack heldItemStack = player.getMainHandItem();
            TextComponent itemNamed = new TextComponent(heldItemStack.getRarity().color + heldItemStack.getDisplayName().getString());

            HoverEvent hoverEvent = new HoverEvent(HoverEvent.Action.SHOW_ITEM, new HoverEvent.ItemStackInfo(heldItemStack));

            Component mensagem = MessageArgument.getMessage(command, "mensagem");
            TextComponent chatMessage = new TextComponent("§7[G]§f \uD80C\uDCDA " + player.getName().getString()+" : " +mensagem.getString()+ " ");
            chatMessage.append(itemNamed.withStyle(Style.EMPTY.withHoverEvent(hoverEvent)));

            player.getServer().getPlayerList().broadcastMessage(chatMessage, ChatType.CHAT, Util.NIL_UUID);
        }
        return Command.SINGLE_SUCCESS;
    }
}
