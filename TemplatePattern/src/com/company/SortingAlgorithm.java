package com.company;


public abstract class SortingAlgorithm {
    public  abstract void intialize();
    public  abstract void sorting();
    public abstract void printResult();
    public void sort(){
        intialize();
        sorting();
        printResult();
    }

}