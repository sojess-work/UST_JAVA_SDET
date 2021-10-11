package com.ust.test;
class Animal2{
	protected void display() {
		System.out.println("I am an animal");
	}
}
class Dog1 extends Animal2{
	
}

public class ProtectedExample {

	public static void main(String[] args) {
		Dog1 d= new Dog1();
		d.display();

	}

}
