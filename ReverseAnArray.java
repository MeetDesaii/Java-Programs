// Write a Java Program To Reverse an Array.

package com.CodeByMeet;
import java.util.Scanner;
public class ReverseAnArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] arr=new int[5];
        int l=arr.length;
        int n=Math.floorDiv(l,2);         // It Will Give Integer Output Of Its Division.
        System.out.println("Enter 5 Numbers : ");
        for(int i=0;i<l;i++){
            arr[i]=sc.nextInt();
        }
        int temp;
        System.out.println("\nReversed Array is : ");
        for(int i=0;i<n;i++){
            temp=arr[i];               // Logic of Swapping...
            arr[i]=arr[l-1-i];
            arr[l-1-i]=temp;
        }
        for(int element : arr){         // Printing Using For Each Loop
            System.out.print(element + " ");
        }
    }
}
