package com.ust.test;
import java.util.Scanner;

public class SumOfPositiveNumbers {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int sum=0;
		System.out.println("Enter a number");
		int number = in.nextInt();
		while(number > 0) {
			sum+=number;
			System.out.println("Enter a number");
			 number = in.nextInt();
		}
		System.out.println("Sum " + sum);
		in.close();
	}

}
