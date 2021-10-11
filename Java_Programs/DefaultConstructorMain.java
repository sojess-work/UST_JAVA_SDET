package com.ust.test;
class ThisDefaultConstructor {
	int val1, val2;
	ThisDefaultConstructor(){
		val1=10;
		val2=20;
	}
	ThisDefaultConstructor get() {
		return this;
	}
	void display() {
		System.out.println("Value of var1 "+val1+" Value of var2 "+val2);
	}
}

public class DefaultConstructorMain {

	public static void main(String[] args) {
		ThisDefaultConstructor t1 = new ThisDefaultConstructor();
		t1.get().display();

	}

}
