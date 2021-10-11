package com.ust.test;


public class MethodOverloadingExample {
	int sum(int x,int y) {
		return x+y;
	}
	int sum(int x, int y, int z) {
		return x+y+z;
	}

	public static void main(String[] args) {
		MethodOverloadingExample m = new MethodOverloadingExample();
		System.out.println(m.sum(20,3));
		System.out.println(m.sum(20,3,5));

	}

}
