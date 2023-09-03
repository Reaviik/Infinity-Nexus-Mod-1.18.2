package com.Infinity.Nexus.utils;

import net.minecraftforge.energy.EnergyStorage;

public abstract class ModEnergyStorage extends EnergyStorage {
    public ModEnergyStorage(int capacity, int maxTransfer) {
        super(capacity,maxTransfer);
    }

    @Override
    public int extractEnergy(int maxExtract, boolean simulate) {
        int extractEnergy = super.extractEnergy(maxExtract, simulate);
        if(extractEnergy != 0){
            onEnergyChanged();
        }
        return extractEnergy;
    }

    @Override
    public int receiveEnergy(int maxReceive, boolean simulate) {
        int receiveEnergy = super.receiveEnergy(maxReceive, simulate);
        if(receiveEnergy != 0){
            onEnergyChanged();
        }
        return receiveEnergy;
    }
    public int setEnergy(int energy){
        this.energy = energy;
        return energy;
    }
    public abstract void onEnergyChanged();

}