package com.ust.test;
class Animal{
	Animal(){
	System.out.println("I am an animal");
}
}
class Dog extends Animal{
	Dog(){
		super();
		System.out.println("I am a Dog");
	}
}
public class SuperExample {

	public static void main(String[] args) {
		Dog d = new Dog();
		

	}

}
