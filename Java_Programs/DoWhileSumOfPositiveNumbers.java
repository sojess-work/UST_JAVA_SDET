package com.ust.test;

import java.util.Scanner;

public class DoWhileSumOfPositiveNumbers {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int sum=0;
		System.out.println("Enter a number");
		int number = in.nextInt();
		do {
			sum+=number;
			System.out.println("Enter a number");
			 number = in.nextInt();
		}while(number>0);
		System.out.println("Sum " + sum);
		in.close();
	}

}
