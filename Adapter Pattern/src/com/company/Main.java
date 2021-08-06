package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
         Vehicle vehicle;
         vehicle=new Bus();
         vehicle.accelerate();
         vehicle=new Car();
         vehicle.accelerate();
         vehicle=new BiCycleAdapter(new BiCycle());
         vehicle.accelerate();

    }
}
