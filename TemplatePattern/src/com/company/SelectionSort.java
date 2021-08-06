package com.company;
public class SelectionSort  extends SortingAlgorithm{

    private  int[] numbers;
    SelectionSort(){
        System.out.println("selection sort constructor");
    }

    @Override
    public void intialize() {
        System.out.println("intializing selection sort");
        numbers= new int[]{5, 3, 6, 9, 2};

    }

    @Override
    public void sorting() {
        int n = numbers.length;
        for (int i = 0; i < n-1; i++)
        {

            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (numbers[j] < numbers[min_idx])
                    min_idx = j;

            int temp = numbers[min_idx];
            numbers[min_idx] = numbers[i];
            numbers[i] = temp;
        }
    }

    @Override
    public void printResult() {
        for(int i=0;i<numbers.length;i++)
            System.out.println(numbers[i]);
    }
}
