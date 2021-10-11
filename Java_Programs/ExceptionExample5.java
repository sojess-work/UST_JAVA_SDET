package com.ust.test;
class MyException extends Exception{
	private static int[] accno = {1001,1002,1003,1004};
	private static String[] name = {"Steve","Abhi","Arjun","Aimi"};
	private static double[] bal= {10000.00,12000.00,999.00,5600.00,1100.55};
	public int len=accno.length;
	
	MyException(){
		
	}
	MyException(String str){
		super(str);
	}
	public int getAccNo(int i){
		return this.accno[i];
	}
	public String getName(int i) {
		return this.name[i];
	}
	public double getBal(int i) {
		return this.bal[i];
	}
}
public class ExceptionExample5 {

	public static void main(String[] args) {
		MyException b = new MyException();
		try {
			System.out.println("Accout No\t"+"Cutomer Name\t"+"Balance");
			for(int i=0;i<b.len;i++) {
				System.out.println(b.getAccNo(i)+"\t\t"+b.getName(i)+"\t\t"+b.getBal(i));
				if(b.getBal(i)<1000){
					MyException me = new MyException("Balance is less than 1000");
					throw me;
				}
			}
		} catch (MyException e) {
			e.printStackTrace();
		}

	}

}
