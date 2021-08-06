package com.company;

public class BubbleSort extends  SortingAlgorithm{
    private  int[] numbers;
    BubbleSort(){
        System.out.println("bubble sort constructor");
    }

    @Override
    public void intialize() {
        System.out.println("intializing bubble sort");
        numbers= new int[]{5, 3, 6, 9, 2};

    }

    @Override
    public void sorting() {
        int n = numbers.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (numbers[j] > numbers[j+1])
                {

                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }
    }

    @Override
    public void printResult() {
      for(int i=0;i<numbers.length;i++)
          System.out.println(numbers[i]);
    }
}
