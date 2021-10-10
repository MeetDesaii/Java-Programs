// Write a Java Program to Find Factorial of a Number Using Recursion.

package com.CodeByMeet;
import java.util.Scanner;
public class FactorialUsingRecursion {
    public static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        else{
            return n*factorial(n-1);              // Recursion
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int a=sc.nextInt();
        int factorial=factorial(a);
        System.out.printf("\nFactorial of %d is %d",a,factorial);
    }
}
