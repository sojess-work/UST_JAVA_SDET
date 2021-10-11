package com.ust.test;
class Animal1{
	public int legCount;
	public void display() {
		System.out.println("legcount " +legCount);
	}
	
}
public class PublicExample {

	public static void main(String[] args) {
		Animal1 a = new Animal1();
		a.display();

	}

}
