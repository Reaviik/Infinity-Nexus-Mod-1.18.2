package com.Infinity.Nexus.recipes;

import com.Infinity.Nexus.InfinityNexus;
import com.Infinity.Nexus.recipes.Foundry.FoundryRecipes;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModRecipes {
    public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS =
            DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, InfinityNexus.MOD_ID);
    public static final RegistryObject<RecipeSerializer<FoundryRecipes>> FOUNDRY_RECIPE =
            SERIALIZERS.register("foundry_recipe", () -> FoundryRecipes.Serializer.INSTANCE);

    public static void register(IEventBus eventBus) {
        SERIALIZERS.register(eventBus);
    }
}