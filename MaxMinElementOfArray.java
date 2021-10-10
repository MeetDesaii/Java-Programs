// Write a Java Program to Find The Maximum And Minimum Elements Of Array.

package com.CodeByMeet;
import java.util.Scanner;
public class MaxMinElementOfArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] arr=new int [5];
        System.out.println("Enter 5 Elements : ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int max=Integer.MIN_VALUE;        // To Get Minimum Integer Value of JAVA
        for(int element : arr){
            if(max<element){
                max=element;
            }
        }
        System.out.println("Maximum Element Of This Data is : "+max);
        int min=Integer.MAX_VALUE;        // To Get Maximum Integer Value Of JAVA
        for(int element : arr){
            if(min>element){
                min=element;
            }
        }
        System.out.println("Minimum Element Of This Data is : "+min);
    }
}
