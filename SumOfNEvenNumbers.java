// Write a Program To (Print & Sum) First N Even Numbers Using For Loop.

package com.CodeByMeet;
import java.util.Scanner;
public class SumOfNEvenNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number That How Many Even Numbers You Want to Print : ");
        int a=sc.nextInt();
        int sum=0;
        for(int i=0;i<=a;i++){
            System.out.println(2*i);
            sum=sum+(2*i);
        }
        System.out.println("Sum Of These Even Numbers : "+sum);
    }
}