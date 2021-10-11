package com.ust.test;
class Method{
	
	void add(float a, float b) {
		System.out.println(a+b);
	}
	void add(int a, int b) {
		System.out.println(a+b);
	}
}

public class MethodOverloadingMain {
	public static void main(String[] args) {
		Method a = new Method();
		a.add(5, 6);
		a.add(6.1f,5.9f );

	}

}
