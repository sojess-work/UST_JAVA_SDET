package com.ust.test;

public class PostDecOptDemo {
    public static void main(String[] args) {
        int i = 5, j= 5, sum = 0;
        System.out.println("value of i is "+i+"j is "+j);
        sum=i+j--;
        System.out.println("value of i is "+i+"j is "+j);
    }
}
