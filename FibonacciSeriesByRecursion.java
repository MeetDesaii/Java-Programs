// Enter a Number and Return It's Fibonacci Series Number.

package com.CodeByMeet;
import java.util.Scanner;
public class FibonacciSeriesByRecursion {
    public static int fibonacci(int n){
        if(n==1 || n==2){
            return n-1;
        }
        else{
            return fibonacci(n-1)+fibonacci(n-2);        // Recursion
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int a = sc.nextInt();
        int b=fibonacci(a);
        System.out.print("Fibonacci Number of That Series is : "+b);
    }
}

// Fibonacci Series : 0 1 1 2 3 5 8 13 21 34 55 89 ......