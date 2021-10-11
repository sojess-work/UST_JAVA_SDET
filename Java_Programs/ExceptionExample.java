package com.ust.test;

public class ExceptionExample {

	public static void main(String[] args) {
		String st="bb";
		String str=null;
		try {
			System.out.println(str.length());
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}
