package com.ust.test;
class Human{
	void eat() {
		System.out.println("human is eating");
	}
}
class Boy extends Human{
	void eat() {
		System.out.println("Boy is eating");
	}
}

public class MethodOverridingExample {
	

	public static void main(String[] args) {
		Boy b= new Boy();
		b.eat();

	}

}
