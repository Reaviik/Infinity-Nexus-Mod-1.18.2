package com.Infinity.Nexus.Mod.effect;

import com.Infinity.Nexus.Mod.InfinityNexusMod;
import net.minecraft.world.effect.MobEffect;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModEffects {
    public static final DeferredRegister<MobEffect> MOB_EFFECTS
            = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, InfinityNexusMod.MOD_ID);

    //public static final RegistryObject<MobEffect> FREEZE = MOB_EFFECTS.register("freeze",
    //        () -> new FreezeEffect(MobEffectCategory.HARMFUL, 3124687));

    public static void register(IEventBus eventBus) {
        MOB_EFFECTS.register(eventBus);
    }
}