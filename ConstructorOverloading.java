package com.ust.test;

public class ConstructorOverloading {
    String language;
    ConstructorOverloading(){
      language = "java";
    }
    ConstructorOverloading(String language){
        this.language = language;
    }
    public void getName(){
        System.out.println("Pogramming language " + this.language);
    }
    public static void main(String[] args) {
        ConstructorOverloading obj = new ConstructorOverloading();
        ConstructorOverloading obj1 = new ConstructorOverloading("Python");
        obj.getName();
        obj1.getName();

    }
}
