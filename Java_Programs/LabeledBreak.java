package com.ust.test;

public class LabeledBreak {
	public static void  main(String[] args) {
		first:
			for(int i=0; i<5; i++) {
				second:
					for(int j=0;j<3;j++) {
						System.out.println("i="+i+"; j="+j);
						if(i==2) {
							break first;
						}
					}
			}
	}

}
