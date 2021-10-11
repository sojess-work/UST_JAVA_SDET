package com.ust.test;
interface ln1{
	final int a =10;
	default void display(){
		System.out.println("Hello!");
	}
}
public class InterfaceExample3 implements ln1{

	public static void main(String[] args) {
		InterfaceExample3 t = new InterfaceExample3();
		t.display();

	}

}
