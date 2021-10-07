package com.ust.test;

public class AverageExample {
    public static void main(String[] args) {
        int[] numbers = {2,-9,0,5,12,-25,22,9,8,12};
        int sum=0;
        double average=0;
        for(int num : numbers){
            sum+=num;
        }
        int n= numbers.length;
        average = (double)(sum)/(double) (n);
        System.out.println("Sum "+sum);
        System.out.println("Average "+average);
    }
}
