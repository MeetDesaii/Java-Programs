// Use Comparison Operators To Find Out Whether a Given Number is Greater Than The User Entered Number or Not.

package com.CodeByMeet;
import java.util.Scanner;
public class UseOfComparisonOperator {
    public static void main(String[] args) {
        System.out.print("Enter Your Age To Check You're Valid for Voting or Not : ");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println(a>=18);         //It'll Return Either True or False.
    }
}
