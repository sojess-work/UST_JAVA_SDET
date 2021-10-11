package com.ust.test;
class TestMethod{
	int val1;
	int val2;
	TestMethod(){
		val1=10;
		val2=20;
	}
	void printVal(TestMethod obj) {
		System.out.println("Value of var1 "+obj.val1+" Value of var2 "+obj.val2);
	}
	void get() {
		printVal(this);
	}
}

public class TestMethodMain {

	public static void main(String[] args) {
		TestMethod obje = new TestMethod();
		obje.get();
	}

}
