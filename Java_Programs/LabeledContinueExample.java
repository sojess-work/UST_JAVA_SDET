package com.ust.test;

public class LabeledContinueExample {

	public static void main(String[] args) {
		first:
		for(int i = 0; i < 6; i++) {
			for(int j = 1; j < 5; j++) {
				if(i==3 || j==2) {
					continue first;
				}
				System.out.println("i"+i+"; j"+j);
				
			}
		}

	}

}
