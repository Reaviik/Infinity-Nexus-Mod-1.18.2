package com.Infinity.Nexus.item;

import com.Infinity.Nexus.InfinityNexus;
import net.minecraft.client.gui.screens.Overlay;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.LazyLoadedValue;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Supplier;
public enum ModArmorMaterials  implements ArmorMaterial {


    IMPERIAL("imperial_infinity", -1, new int[]{22,25,28,22}, 80, SoundEvents.ARMOR_EQUIP_NETHERITE, 15.0F, 24.0F, () -> {
        return Ingredient.of(ModItems.INFINITY_INGOT.get());
    }),
    INFINITY("infinity", 1000, new int[] {12,15,18,12},80, SoundEvents.ARMOR_EQUIP_DIAMOND, 15.0F, 24.0F, () ->{
        return Ingredient.of(ModItems.INFINITY_INGOT.get());
    }),
    BLUE("blue_infinity", 1000, new int[] {12,15,18,12},80, SoundEvents.ARMOR_EQUIP_DIAMOND, 15.0F, 24.0F, () ->{
        return Ingredient.of(ModItems.INFINITY_INGOT.get());
    }),
    GOLD("gold_infinity", 1000, new int[] {12,15,18,12},80, SoundEvents.ARMOR_EQUIP_DIAMOND, 15.0F, 24.0F, () ->{
        return Ingredient.of(ModItems.INFINITY_INGOT.get());
    }),
    GREEN("green_infinity", 1000, new int[] {12,15,18,12},80, SoundEvents.ARMOR_EQUIP_DIAMOND, 15.0F, 24.0F, () ->{
        return Ingredient.of(ModItems.INFINITY_INGOT.get());
    }),
    PINK("pink_infinity", 1000, new int[] {12,15,18,12},80, SoundEvents.ARMOR_EQUIP_DIAMOND, 15.0F, 24.0F, () ->{
        return Ingredient.of(ModItems.INFINITY_INGOT.get());
    }),
    PURPLE("purple_infinity", 1000, new int[] {12,15,18,12},80, SoundEvents.ARMOR_EQUIP_DIAMOND, 15.0F, 24.0F, () ->{
        return Ingredient.of(ModItems.INFINITY_INGOT.get());
    }),
    RED("red_infinity", 1000, new int[] {12,15,18,12},80, SoundEvents.ARMOR_EQUIP_DIAMOND, 15.0F, 24.0F, () ->{
        return Ingredient.of(ModItems.INFINITY_INGOT.get());
    }),
    SILVER("silver_infinity", 1000, new int[] {12,15,18,12},80, SoundEvents.ARMOR_EQUIP_DIAMOND, 15.0F, 24.0F, () ->{
        return Ingredient.of(ModItems.INFINITY_INGOT.get());
    }),
    YELLOW("yellow_infinity", 1000, new int[] {12,15,18,12},80, SoundEvents.ARMOR_EQUIP_DIAMOND, 15.0F, 24.0F, () ->{
        return Ingredient.of(ModItems.INFINITY_INGOT.get());
    });

    //Boots, Leggings, Chestplate, Helmet
    private static final int[] HEALTH_PER_SLOT = new int[]{13, 15, 16, 11};
    private final String name;
    private final int durabilityMultiplier;
    private final int[] slotProtections;
    private final int enchantmentValue;
    private final SoundEvent sound;
    private final float toughness;
    private final float knockbackResistance;
    private final LazyLoadedValue<Ingredient> repairIngredient;

    ModArmorMaterials(String name, int durabilityMultiplier, int[] slotProtections, int enchantmentValue,
                      SoundEvent sound, float toughness, float knockbackResistance, Supplier<Ingredient> ingredientSupplier) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.slotProtections = slotProtections;
        this.enchantmentValue = enchantmentValue;
        this.sound = sound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredient = new LazyLoadedValue<>(ingredientSupplier);
    }

    public int getDurabilityForSlot(EquipmentSlot pSlot) {
        return HEALTH_PER_SLOT[pSlot.getIndex()] * this.durabilityMultiplier;
    }

    public int getDefenseForSlot(EquipmentSlot pSlot) {
        return this.slotProtections[pSlot.getIndex()];
    }

    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    public SoundEvent getEquipSound() {
        return this.sound;
    }
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    public String getName() {
        return InfinityNexus.MOD_ID + ":" + this.name;
    }

    public float getToughness() {
        return this.toughness;
    }

    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}