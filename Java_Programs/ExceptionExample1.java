package com.ust.test;

public class ExceptionExample1 {

	public static void main(String[] args) {
		int a=5;
		int b=0;
		try {
			System.out.println(a/b);
		}catch (ArithmeticException c) {
			System.out.println(c.getMessage());
		}
		finally {
			System.out.println("this is the final block");
		}

	}

}
