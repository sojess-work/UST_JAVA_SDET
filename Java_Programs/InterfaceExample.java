package com.ust.test;
interface Polygon{
	void getArea(int length, int breadth);
}
class Rectangle1 implements Polygon{
	public void getArea(int length, int breadth) {
		System.out.println("Area is "+ length*breadth);
	}
}

public class InterfaceExample {

	public static void main(String[] args) {
		Rectangle1 r1= new Rectangle1();
		r1.getArea(5, 10);

	}

}
