package com.ust.test;

public class PrivateConstructor {
    int a;
    boolean b;
    private PrivateConstructor(){
        a=1;
        b=true;
    }
    public static void main(String[] args) {
        PrivateConstructor obj = new PrivateConstructor();
        System.out.println("Default Value:");
        System.out.println("a = " + obj.a);
        System.out.println("b = " + obj.b);

    }
}
