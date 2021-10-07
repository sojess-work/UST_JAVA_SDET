package com.ust.test;

public class ForEachLoopArrayExmple {
    public static void main(String[] args) {
        int[ ] age = {1,2,4,5};//create an array
        System.out.println("Using for each loop");
        for(int a: age){ //iterating using advanced for loop
            System.out.println(a);
        }
    }
}
