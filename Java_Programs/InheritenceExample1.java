package com.ust.test;
class Teacher1{
	void teaches() {
		System.out.println("Teacher teaches");
	}
}
class Students1 extends Teacher1{
	void listen() {
		System.out.println("student listens");
	}
}
class Tution extends Students1{
	void does() {
		System.out.println("does homwork");
	}
}

public class InheritenceExample1 {

	public static void main(String[] args) {
		Tution s1 = new Tution();
		s1.teaches();
		s1.listen();
		s1.does();

	}

}
