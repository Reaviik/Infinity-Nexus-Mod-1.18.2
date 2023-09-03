package com.Infinity.Nexus.recipes.Foundry;

import com.Infinity.Nexus.InfinityNexus;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import net.minecraft.core.NonNullList;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.GsonHelper;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.Level;
import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

public class FoundryRecipes implements Recipe<SimpleContainer> {
    private final ResourceLocation id;
    private final ItemStack output;
    private final NonNullList<Ingredient> recipeItems;
    private final List<ItemStack> secondary;

    public FoundryRecipes(ResourceLocation id, ItemStack output,
                                   NonNullList<Ingredient> recipeItems, List<ItemStack> secondary) {
        this.id = id;
        this.output = output;
        this.recipeItems = recipeItems;
        this.secondary = secondary;
    }

    @Override
    public boolean matches(SimpleContainer pContainer, Level pLevel) {
        return recipeItems.get(0).test(pContainer.getItem(0));
    }
    @Override
    public NonNullList<Ingredient> getIngredients() {
        return recipeItems;
    }

    @Override
    public ItemStack assemble(SimpleContainer pContainer) {
        return output.copy();
    }

    @Override
    public boolean canCraftInDimensions(int pWidth, int pHeight) {
        return true;
    }

    @Override
    public ItemStack getResultItem() {
        return output.copy();
    }

    public List<ItemStack> getSecondary() {
        return secondary;
    }

    @Override
    public ResourceLocation getId() {
        return id;
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return Serializer.INSTANCE;
    }

    @Override
    public RecipeType<?> getType() {
        return Type.INSTANCE;
    }

    public List<ItemStack> getOutputs() {
        List<ItemStack> outputs = new ArrayList<>();
        outputs.add(output);
        outputs.addAll(secondary);
        return outputs;
    }

    public static class Type implements RecipeType<FoundryRecipes> {
        private Type() { }
        public static final Type INSTANCE = new Type();
        public static final String ID = "foundry_recipe";
    }

    public static class Serializer implements RecipeSerializer<FoundryRecipes> {
        public static final Serializer INSTANCE = new Serializer();
        public static final ResourceLocation ID = new ResourceLocation(InfinityNexus.MOD_ID, "foundry_recipe");

        @Override
        public FoundryRecipes fromJson(ResourceLocation id, JsonObject json) {
            ItemStack output = ShapedRecipe.itemStackFromJson(GsonHelper.getAsJsonObject(json, "output"));

            JsonArray ingredients = GsonHelper.getAsJsonArray(json, "ingredients");
            NonNullList<Ingredient> inputs = NonNullList.withSize(1, Ingredient.EMPTY);

            for (int i = 0; i < inputs.size(); i++) {
                inputs.set(i, Ingredient.fromJson(ingredients.get(i)));
            }

            List<ItemStack> secondary = new ArrayList<>();
            if (json.has("secondary")) {
                JsonArray secondaryArray = GsonHelper.getAsJsonArray(json, "secondary");
                for (int i = 0; i < secondaryArray.size(); i++) {
                    ItemStack stack = ShapedRecipe.itemStackFromJson(secondaryArray.get(i).getAsJsonObject());
                    secondary.add(stack);
                }
            }

            return new FoundryRecipes(id, output, inputs, secondary);
        }

        @Override
        public FoundryRecipes fromNetwork(ResourceLocation id, FriendlyByteBuf buf) {
            NonNullList<Ingredient> inputs = NonNullList.withSize(buf.readInt(), Ingredient.EMPTY);

            for (int i = 0; i < inputs.size(); i++) {
                inputs.set(i, Ingredient.fromNetwork(buf));
            }

            ItemStack output = buf.readItem();

            List<ItemStack> secondary = new ArrayList<>();
            int secondarySize = buf.readInt();
            for (int i = 0; i < secondarySize; i++) {
                secondary.add(buf.readItem());
            }
            return new FoundryRecipes(id, output, inputs, secondary);
        }

        @Override
        public void toNetwork(FriendlyByteBuf buf, FoundryRecipes recipe) {
            buf.writeInt(recipe.getIngredients().size());
            for (Ingredient ing : recipe.getIngredients()) {
                ing.toNetwork(buf);
            }
            buf.writeItemStack(recipe.getResultItem(), false);
        }

        @Override
        public RecipeSerializer<?> setRegistryName(ResourceLocation name) {
            return INSTANCE;
        }

        @Nullable
        @Override
        public ResourceLocation getRegistryName() {
            return ID;
        }

        @Override
        public Class<RecipeSerializer<?>> getRegistryType() {
            return Serializer.castClass(RecipeSerializer.class);
        }

        @SuppressWarnings("unchecked") // Need this wrapper, because generics
        private static <G> Class<G> castClass(Class<?> cls) {
            return (Class<G>)cls;
        }
    }
}