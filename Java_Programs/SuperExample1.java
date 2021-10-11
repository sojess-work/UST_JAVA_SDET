package com.ust.test;
class Parentclass{
	void display() {
		System.out.println("Parent class method ");
	}
}
class ChildClass extends Parentclass{
	void display() {
		System.out.println("Child class method ");
	}
	void printMsg(){
		display();
		super.display();
	}
}
public class SuperExample1 {

	public static void main(String[] args) {
		ChildClass c1 =  new ChildClass();
		c1.printMsg();

	}

}
