package com.ust.test;
import java.util.Scanner;

public class SwitchExampleString {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String x = in.next();
		switch(x) {
		case "Arjun" : 
			System.out.println("Name is Arjun");
			break;
		case "Sojess":
			System.out.println("Name is Sojess");
			break;
		default :
			System.out.println("Name is not found");
		}
	}

}
