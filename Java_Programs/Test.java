package com.ust.test;

public class Test {
	static int a =m1();
	static {
		System.out.println("Inside static block");
	}
	static int m1() {
		System.out.println("From m1");
		return 20;
	}

	public static void main(String[] args) {
		System.out.println("value of a "+a);
		System.out.print("from main");

	}

}
