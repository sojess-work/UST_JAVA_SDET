package com.ust.test;

public class ForLoopArrayExample {
    public static void main(String[] args) {
        int[] age = {12,4,5}; //create an array
        System.out.println("Using for loop");
        for(int i=0; i<age.length; i++){ //looping through the array
            System.out.println(age[i]);
        }
    }
}
