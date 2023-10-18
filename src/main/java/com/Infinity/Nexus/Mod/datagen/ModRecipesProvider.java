package com.Infinity.Nexus.Mod.datagen;

import com.Infinity.Nexus.Mod.block.ModBlocks;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

public class ModRecipesProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipesProvider(DataGenerator p_125973_) {
        super(p_125973_);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> finishedRecipeConsumer) {
        ShapedRecipeBuilder.shaped(ModBlocks.EXPLORAR_PORTAL.get())
                .define('E', ModBlocks.INFINITY_BLOCK.get())
                .pattern("EE")
                .pattern("EE")
                .pattern("EE")
                .unlockedBy("has_block", inventoryTrigger(ItemPredicate.Builder.item()
                .of(ModBlocks.INFINITY_BLOCK.get()).build()))
                .save(finishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(ModBlocks.EXPLORAR_PORTAL.get())
                .requires(ModBlocks.INFINITY_BLOCK.get())
                .unlockedBy("has_block", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.INFINITY_BLOCK.get()).build()))
                .save(finishedRecipeConsumer);
    }
}
