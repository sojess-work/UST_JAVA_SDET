package com.ust.test;
class Teacher{
	void speaks(){
		System.out.println("Teacher speaks");
	}
}
class Students extends Teacher{
	void listen() {
		System.out.println("Students listens");
	}
}
public class InheritenceExample {

	public static void main(String[] args) {
		Students s1 = new Students();
		s1.speaks();
		s1.listen();

	}

}
