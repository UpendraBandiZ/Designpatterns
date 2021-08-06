package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Beverage beverage=new Sugar(new Sugar(new Milk(new PlainBeverage())));
        System.out.println(beverage.getCost());
        System.out.println(beverage.getDescription());

    }
}
