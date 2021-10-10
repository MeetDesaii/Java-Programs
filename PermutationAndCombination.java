// Write a Java program to Calculate Permutation and Combination of n and r (nCr & nPr).

package com.CodeByMeet;
import java.util.Scanner;
public class PermutationAndCombination {
    public static int fact(int num){
        int fact=1;                                    // Calculating Factorial of a Number
        for(int i=1;i<=num;i++){
            fact = fact*i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Value of n : ");
        int n=sc.nextInt();
        System.out.print("Enter a Value of r : ");
        int r=sc.nextInt();
        int a=fact(n)/(fact(n-r)*fact(r));        // Formula of nCr = n! / ((n-r)! * r!)
        int b=fact(n)/fact(n-r);                  // Formula of nPr = n! / (n-r)!
        System.out.print("nCr : "+a);
        System.out.print("\nnPr : "+b);
    }
}
