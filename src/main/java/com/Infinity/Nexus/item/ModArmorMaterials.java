package com.Infinity.Nexus.item;

import com.Infinity.Nexus.InfinityNexus;
import com.Infinity.Nexus.config.ModCommonConfigs;
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

    IMPERIAL("imperial_infinity", -1,
            new int[]{0,0,0,0}, ModCommonConfigs.I_I_A_E_VALUE.get(), SoundEvents.ARMOR_EQUIP_NETHERITE, 0F, 0f, () -> {
        return Ingredient.of(ModItems.INFINITY_INGOT.get());
    }),
    INFINITY("infinity", ModCommonConfigs.I_A_DURABILITY.get(),
            new int[] {ModCommonConfigs.I_A_B_ARMOR.get(),ModCommonConfigs.I_A_L_ARMOR.get(),ModCommonConfigs.I_A_C_ARMOR.get(),ModCommonConfigs.I_A_H_ARMOR.get()},
            ModCommonConfigs.I_A_E_VALUE.get(), SoundEvents.ARMOR_EQUIP_DIAMOND, ModCommonConfigs.I_A_TOUGHNESS.get(), ModCommonConfigs.I_A_K_RESISTANCE.get(), () ->{
        return Ingredient.of(ModItems.INFINITY_INGOT.get());
    }),
    BLUE("blue_infinity", ModCommonConfigs.I_A_DURABILITY.get(),
            new int[] {ModCommonConfigs.I_A_B_ARMOR.get(),ModCommonConfigs.I_A_L_ARMOR.get(),ModCommonConfigs.I_A_C_ARMOR.get(),ModCommonConfigs.I_A_H_ARMOR.get()},
            ModCommonConfigs.I_A_E_VALUE.get(), SoundEvents.ARMOR_EQUIP_DIAMOND, ModCommonConfigs.I_A_TOUGHNESS.get(), ModCommonConfigs.I_A_K_RESISTANCE.get(), () ->{
        return Ingredient.of(ModItems.INFINITY_INGOT.get());
    }),
    GOLD("gold_infinity", ModCommonConfigs.I_A_DURABILITY.get(),
            new int[] {ModCommonConfigs.I_A_B_ARMOR.get(),ModCommonConfigs.I_A_L_ARMOR.get(),ModCommonConfigs.I_A_C_ARMOR.get(),ModCommonConfigs.I_A_H_ARMOR.get()},
            ModCommonConfigs.I_A_E_VALUE.get(), SoundEvents.ARMOR_EQUIP_DIAMOND, ModCommonConfigs.I_A_TOUGHNESS.get(), ModCommonConfigs.I_A_K_RESISTANCE.get(), () ->{
        return Ingredient.of(ModItems.INFINITY_INGOT.get());
    }),
    GREEN("green_infinity", ModCommonConfigs.I_A_DURABILITY.get(),
            new int[] {ModCommonConfigs.I_A_B_ARMOR.get(),ModCommonConfigs.I_A_L_ARMOR.get(),ModCommonConfigs.I_A_C_ARMOR.get(),ModCommonConfigs.I_A_H_ARMOR.get()},
            ModCommonConfigs.I_A_E_VALUE.get(), SoundEvents.ARMOR_EQUIP_DIAMOND, ModCommonConfigs.I_A_TOUGHNESS.get(), ModCommonConfigs.I_A_K_RESISTANCE.get(), () ->{
        return Ingredient.of(ModItems.INFINITY_INGOT.get());
    }),
    PINK("pink_infinity", ModCommonConfigs.I_A_DURABILITY.get(),
            new int[] {ModCommonConfigs.I_A_B_ARMOR.get(),ModCommonConfigs.I_A_L_ARMOR.get(),ModCommonConfigs.I_A_C_ARMOR.get(),ModCommonConfigs.I_A_H_ARMOR.get()},
            ModCommonConfigs.I_A_E_VALUE.get(), SoundEvents.ARMOR_EQUIP_DIAMOND, ModCommonConfigs.I_A_TOUGHNESS.get(), ModCommonConfigs.I_A_K_RESISTANCE.get(), () ->{
        return Ingredient.of(ModItems.INFINITY_INGOT.get());
    }),
    PURPLE("purple_infinity", ModCommonConfigs.I_A_DURABILITY.get(),
            new int[] {ModCommonConfigs.I_A_B_ARMOR.get(),ModCommonConfigs.I_A_L_ARMOR.get(),ModCommonConfigs.I_A_C_ARMOR.get(),ModCommonConfigs.I_A_H_ARMOR.get()},
            ModCommonConfigs.I_A_E_VALUE.get(), SoundEvents.ARMOR_EQUIP_DIAMOND, ModCommonConfigs.I_A_TOUGHNESS.get(), ModCommonConfigs.I_A_K_RESISTANCE.get(), () ->{
        return Ingredient.of(ModItems.INFINITY_INGOT.get());
    }),
    RED("red_infinity", ModCommonConfigs.I_A_DURABILITY.get(),
            new int[] {ModCommonConfigs.I_A_B_ARMOR.get(),ModCommonConfigs.I_A_L_ARMOR.get(),ModCommonConfigs.I_A_C_ARMOR.get(),ModCommonConfigs.I_A_H_ARMOR.get()},
            ModCommonConfigs.I_A_E_VALUE.get(), SoundEvents.ARMOR_EQUIP_DIAMOND, ModCommonConfigs.I_A_TOUGHNESS.get(), ModCommonConfigs.I_A_K_RESISTANCE.get(), () ->{
        return Ingredient.of(ModItems.INFINITY_INGOT.get());
    }),
    SILVER("silver_infinity", ModCommonConfigs.I_A_DURABILITY.get(),
            new int[] {ModCommonConfigs.I_A_B_ARMOR.get(),ModCommonConfigs.I_A_L_ARMOR.get(),ModCommonConfigs.I_A_C_ARMOR.get(),ModCommonConfigs.I_A_H_ARMOR.get()},
            ModCommonConfigs.I_A_E_VALUE.get(), SoundEvents.ARMOR_EQUIP_DIAMOND, ModCommonConfigs.I_A_TOUGHNESS.get(), ModCommonConfigs.I_A_K_RESISTANCE.get(), () ->{
        return Ingredient.of(ModItems.INFINITY_INGOT.get());
    }),
    YELLOW("yellow_infinity", ModCommonConfigs.I_A_DURABILITY.get(),
            new int[] {ModCommonConfigs.I_A_B_ARMOR.get(),ModCommonConfigs.I_A_L_ARMOR.get(),ModCommonConfigs.I_A_C_ARMOR.get(),ModCommonConfigs.I_A_H_ARMOR.get()},
            ModCommonConfigs.I_A_E_VALUE.get(), SoundEvents.ARMOR_EQUIP_DIAMOND, ModCommonConfigs.I_A_TOUGHNESS.get(), ModCommonConfigs.I_A_K_RESISTANCE.get(), () ->{
        return Ingredient.of(ModItems.INFINITY_INGOT.get());
    });

    //Boots, Leggings, Chestplate, Helmet

    private static final int[] HEALTH_PER_SLOT = new int[]{13,15,20,12};
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