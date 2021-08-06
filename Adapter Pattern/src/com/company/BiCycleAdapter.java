package com.company;

public class BiCycleAdapter implements  Vehicle{
    BiCycle biCycle;
    BiCycleAdapter(BiCycle biCycle){
        this.biCycle=biCycle;
    }

    @Override
    public void accelerate() {
            biCycle.go();
    }
}
