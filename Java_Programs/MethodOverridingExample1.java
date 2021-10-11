package com.ust.test;
class Abc{
	void disp() {
		System.out.println("Parent class display");
	}
}
class Demo extends Abc{
	void disp() {
		System.out.println("Childclass display");
}
	void newMethod() {
		System.out.println("Child class method");
	}
}
	
	public class MethodOverridingExample1 {

	public static void main(String[] args) {
		Abc obj1= new Abc();
		obj1.disp();
		Abc obj2 = new Demo();
		obj2.disp();
		Demo obj3 = new Demo();
		obj3.disp();
		
	}
	

}
