package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        SortingAlgorithm sortingAlgorithm=new SelectionSort();
        sortingAlgorithm.sort();
        sortingAlgorithm=new BubbleSort();
        sortingAlgorithm.sort();

    }
}
