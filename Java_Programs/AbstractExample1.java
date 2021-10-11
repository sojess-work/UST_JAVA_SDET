package com.ust.test;
abstract class Shape{
	String color;
	abstract double area();
	public abstract String toString();
	public Shape(String color) {
		this.color=color;
	}
	public String getColor() {
		return this.color;
	}
	public void setColor(String color) {
		this.color=color;
	}
	
}
class Circle extends Shape{
	double radius;
	public Circle(String color,double radius) {
		super(color);
		System.out.println("Circle constructor called");
		this.radius=radius;
	}
	double area() {
		return Math.PI*Math.pow(this.radius, 2);
	}
	public String toString() {
		return "Circle color is "+super.color+" and area is "+area();
	}
}
class Rectangle extends Shape{
	double length;
	double breadth;
	public Rectangle(String color, double length, double breadth) {
		super(color);
		System.out.println("Rectangle constructor called");
		this.length=length;
		this.breadth=breadth;
	}
	double area() {
		return this.length*this.breadth;
	}
	public String toString() {
		return "REctangle color is "+super.color+" and area is "+area();
	}
}

public class AbstractExample1 {
	public static void main(String[] args) {
		Shape s1 = new Circle("Red",2.2);
		Shape s2= new Rectangle("Yellow",2,4);
		System.out.println(s1.toString());
		System.out.println(s2.toString());
	}
}
