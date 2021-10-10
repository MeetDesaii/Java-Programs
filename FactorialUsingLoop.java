// Write a Program to Find a Factorial Of User Entered Number Using For Loop.

package com.CodeByMeet;
import java.util.Scanner;
public class FactorialUsingLoop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int factorial=1;
        System.out.print("Enter a Number : ");
        int n=sc.nextInt();
        for(int i=n;i>=1;i--){
            factorial *= i;
        }
        System.out.printf("Factorial Of %d is %d",n,factorial);
    }
}
