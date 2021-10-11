package com.ust.test;

public class ExceptionExample3 {

	public static void main(String[] args) {
		try {
			String s= "Hello world";
			char c= s.charAt(15);
			System.out.println(c);
		}catch (StringIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}

	}

}
