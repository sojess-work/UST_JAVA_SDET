package com.ust.test;
class TestThis{
	void print() {
		this.show();
		System.out.println("TestThis::print");
	}
	void show() {
		System.out.println("TestThis::show");
	}
}
public class TestThisMain {

	public static void main(String[] args) {
		TestThis t1 = new TestThis();
		t1.print();

	}

}
