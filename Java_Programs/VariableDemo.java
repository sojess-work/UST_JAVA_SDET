package com.ust.test;
class Variable{
	static int count=0;
	public void increment(){
		count++;
	}

}


public class VariableDemo {
	
	public static void main(String[] args) {
		Variable obj = new Variable();
		Variable obj1 = new Variable();
		obj.increment();
		System.out.println(obj.count);
		obj1.increment();
		System.out.println(obj1.count);

	}

}
