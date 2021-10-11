package com.ust.test;

public class JavaClassExample {
	static int age;
	static String name;
	static void display() {
		System.out.println("Age "+age);
		System.out.println("name "+name);
	}

	public static void main(String[] args) {
		age=30;
		name="Steve";
		display();

	}

}
