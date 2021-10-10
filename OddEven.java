// Check That User's Entered Number is Either Odd or Even.

package com.CodeByMeet;
import java.util.Scanner;
public class OddEven {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int a=sc.nextInt();
        if(a%2==0){
            System.out.println("\nYour Number is Even.");
        }
        else{
            System.out.println("\nYour Number is Odd.");
        }
    }
}

// %=Modulo Operator Which Returns Remainder.
// == used For Comparison.