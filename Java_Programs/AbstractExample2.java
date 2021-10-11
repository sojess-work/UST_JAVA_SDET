package com.ust.test;
abstract class Base{
	abstract void func(); 
}
class Derived extends Base{
	void func()
	{
		System.out.println("derived func is called");
	}
}
public class AbstractExample2 {

	public static void main(String[] args) {
		Base b = new Derived();
		b.func();

	}

}
