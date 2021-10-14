//Replace your name with first name
package com.ust.Assesment;
import java.util.Scanner;
public class ReplaceEquals {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        String s =" I want my name Sojess to be replaced with my last name and I want no repetition of Sojess anywhere";
        System.out.println("Enter your name to be replaced");
        String name = validateName();
        if(s.contains(name)){
            System.out.println("Enter your last name" );
            String lastName = validateName();//contains() is used here
            if(lastName.equals(name)){ //equals() is used here
                System.out.println("Your last name is the one  being used" );
            }else{
            String rs = s.replace(name,lastName);
            s=rs;
            System.out.println( s);
        }}

    }
    public static String validateName(){
        Scanner input = new Scanner(System.in);
        String name = input.next();
        while(!(name.length()>2)){ //length() is used here;
            System.out.println("Enter a valid name");
             name = input.next();
        }
        return name;
    }
}
