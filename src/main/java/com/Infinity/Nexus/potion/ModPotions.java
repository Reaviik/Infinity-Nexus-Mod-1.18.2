package com.Infinity.Nexus.potion;

import com.Infinity.Nexus.InfinityNexusMod;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModPotions {
    public static final DeferredRegister<Potion> POTIONS
            = DeferredRegister.create(ForgeRegistries.POTIONS, InfinityNexusMod.MOD_ID);

    //public static final RegistryObject<Potion> FREEZE_POTION = POTIONS.register("freeze_potion",
    //        () -> new Potion(new MobEffectInstance(ModEffects.FREEZE.get(), 200, 0)));


    public static void register(IEventBus eventBus) {
        POTIONS.register(eventBus);
    }
}