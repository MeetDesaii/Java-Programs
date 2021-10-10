// Question : Write a Program Which Taking Input From User.

package com.CodeByMeet;
import java.util.Scanner;       //Import Scanner Class
public class TakingInputFromUser {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);   //sc is One Type Of Variable
                                            //System.in means We're Taking Input From Keyboard
        System.out.print("Enter 1st Number : ");
        int a=sc.nextInt();    //1st Number Will Come in a
        System.out.print("Enter 2nd Number : ");
        int b=sc.nextInt();    //2nd Number Will Come in b
        int sum=a+b;
        System.out.print("Sum Of Two Numbers are : ");
        System.out.println(sum);
    }
}