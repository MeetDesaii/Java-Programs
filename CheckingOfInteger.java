// Question : Write a Program To Detect Whether a Number Entered By User is Integer or Not.

package com.CodeByMeet;
import java.util.Scanner;
public class CheckingOfInteger {
    public static void main(String[] args) {
        System.out.print("Enter a Number : ");
        Scanner sc=new Scanner(System.in);
        System.out.println(sc.hasNextInt());       //It Will Return Either True or False
                    //If We'll Enter Integer So It'll Return True Otherwise False
    }
}
