package com.ust.test;
class ThisTest{
	int var1;
	int var2;
	ThisTest(int var1, int var2){
		this.var1=var1+var1;
		this.var2=var2+var2;
	}
	void disply() {
		System.out.println("Value of var1 "+var1+" Value of var2 "+var2);
	}
}

public class ThisTestMain {

	public static void main(String[] args) {
		ThisTest t1 = new ThisTest(5,10);
		t1.disply();

	}

}
