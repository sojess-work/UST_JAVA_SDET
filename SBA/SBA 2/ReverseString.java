package com.ust.Assesment;
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        StringBuilder str = new StringBuilder(s);
        int start=0,end = s.length()-1;
        while(start<end){
            char temp =s.charAt(start);
            str.setCharAt(start,s.charAt(end));
            str.setCharAt(end,temp);
            start++;
            end--;


        }
        System.out.println(str);


    }
}
