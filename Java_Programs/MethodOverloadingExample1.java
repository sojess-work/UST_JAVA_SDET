package com.ust.test;

public class MethodOverloadingExample1 {
	double add(int x, double y) {
		return x+y;
	}
	double add(double x, int y) {
		return x+y;
	}

	public static void main(String[] args) {
		MethodOverloadingExample1 m1 = new MethodOverloadingExample1();
		System.out.println(m1.add(30,30.2 ));
		System.out.println(m1.add(50.2,50 ));

	}

}
