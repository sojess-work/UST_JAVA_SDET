package com.ust.test;
class Data1{
	private String name;

public void setName(String name) {
	this.name=name;
}
public String getName() {
	return this.name;
}
}
public class PrivateExample1 {

	public static void main(String[] args) {
		Data1 d = new Data1();
		d.setName("abc");
		System.out.println(d.getName());
		

	}

}
