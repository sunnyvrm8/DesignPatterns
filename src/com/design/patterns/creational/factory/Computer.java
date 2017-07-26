package com.design.patterns.creational.factory;

/**
 * Created by sunny on 26/07/17.
 */
public abstract class Computer {
    public abstract String getRAM(); public abstract String getHDD(); public abstract String getCPU();
    @Override
    public String toString(){
        return "RAM= "+this.getRAM()+", HDD="+this.getHDD()+", CPU="+this.getCPU();
    }
}