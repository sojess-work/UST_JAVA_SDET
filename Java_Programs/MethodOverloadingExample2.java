package com.ust.test;

public class MethodOverloadingExample2 {
	long add(int x, long y) {
		return x+y;
	}
	int add(int x, int y, int z) {
		return x+y+z;
	}

	public static void main(String[] args) {
		MethodOverloadingExample2 m1 = new MethodOverloadingExample2();
		System.out.println(m1.add(30, 10));
		System.out.println(m1.add(20,30, 10));

	}

}
