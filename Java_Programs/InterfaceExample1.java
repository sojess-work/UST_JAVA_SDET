package com.ust.test;
interface Area{
	int getArea(int a, int b);
}
interface Perimeter{
	int getPerimeter(int a, int b);
}
interface Display extends Area,Perimeter{
	public void disp(int a, int b);
}
class Rectangle2 implements Display{
	public int getArea(int a, int b) {
		return a*b;
	}
	public int getPerimeter(int a, int b) {
		return 2*(a+b);
	}
	public void disp(int a, int b) {
		System.out.println("Area: " +getArea(a,b) + " Perimeter: "+getPerimeter(a,b) );
	}
}
public class InterfaceExample1 {

	public static void main(String[] args) {
		Rectangle2 r2 = new Rectangle2();
		r2.disp(10, 5);

	}

}
