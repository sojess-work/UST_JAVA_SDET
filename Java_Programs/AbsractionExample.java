package com.ust.test;
 abstract class Employee{
	private String name;
	private int paymentPerHour;
	public Employee(String name, int paymentPerHour) {
		this.name=name;
		this.paymentPerHour=paymentPerHour;
	}
	public abstract int calculateSalary();
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public int getPaymentPerHour() {
		return this.paymentPerHour;
	}
	public void setPaymentPerHour(int pay) {
		this.paymentPerHour=pay;
	}
}
 class Emp extends Employee{
	 int hour;
	 public Emp(String name, int paymentPerHour) {
		 super( name,paymentPerHour);
		 this.hour=paymentPerHour;
	 }
	 public int calculateSalary() {
		 return hour*12;
		 
	 }
 }

public class AbsractionExample {

	public static void main(String[] args) {
		Employee E1 = new Emp("Steeve",15);
		System.out.println(E1.getName());
		System.out.println(E1.calculateSalary());

	}

}
