package com.ust.Assesment;
import java.util.Scanner;

public class Qn4 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int count =0,sum=0;

        while(count!=10){
            int num =input.nextInt();
            if(num%2==0){
                count++;
                sum+=num;
            }else{
                System.out.println("Odd number, " +(10-count) +" more even numbers left");
                continue;
            }
        }
        System.out.println(sum);
    }
}
