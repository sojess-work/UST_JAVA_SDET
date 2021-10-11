package com.ust.test;
class ThisConstructor{
	int val1;
	int val2;
	ThisConstructor(){
		this(10,20);
		System.out.println("Default constructor");
		
	}
	ThisConstructor(int val1, int val2){
		this.val1=val1;
		this.val2=val2;
		System.out.println("parameterized constructor");
		
	}
}

public class ThisConstructorMain {

	public static void main(String[] args) {
		ThisConstructor t1 = new ThisConstructor();

	}

}
