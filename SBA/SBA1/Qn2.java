package com.ust.Assesment;
import java.util.Scanner;
public class Qn2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the numbers ,Enter 'X' to terminate");
        int sum=0;
        while(input.hasNextInt()){
            int num = input.nextInt();
            if(num>0){
                sum+=num;
            }

        }
        System.out.println(sum);
    }
}
