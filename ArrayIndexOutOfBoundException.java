// Use Try - Catch to solve ArrayIndexOutOfBound Exception.

package com.CodeByMeet;
import java.util.Scanner;

public class ArrayIndexOutOfBoundException{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] a = new int[5];
        a[0] = 19;
        a[1] = 20;
        a[2] = 21;
        a[3] = 22;
        a[4] = 23;

        System.out.print("\nEnter an ArrayIndex : ");
        int i = sc.nextInt();
        System.out.print("Enter a Number (For Division) : ");
        int d = sc.nextInt();

        try{
            double res = (double) a[i]/d;
            System.out.printf("\nValue on index %d is %d.",i,a[i]);
            System.out.printf("\n%d is divided by %d is %f.\n",a[i],d,res);
        }
        catch (java.lang.ArithmeticException | ArrayIndexOutOfBoundsException e){
            System.out.println("\nThis is not Valid ("+e+").");
        }
    }
}
