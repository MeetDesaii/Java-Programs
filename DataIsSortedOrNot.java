// Write a Java Program To Find Whether An Array is Sorted or Not.

package com.CodeByMeet;
import java.util.Scanner;
public class DataIsSortedOrNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] arr=new int [5];
        boolean isSorted=true;                    // Initial Value is True .
        System.out.println("Enter 5 Elements : ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length-1;i++){            // We Must do arr.length-1 in for Loop in Sorting Case !
            if(arr[i]>arr[i+1]){
                isSorted=false;
                break;
            }
        }
        if(isSorted){
            System.out.println("Yes, This Data is Sorted!");
        }
        else{
            System.out.println("No, This Data is Not Sorted!");
        }
    }
}

// This Program Syntax is as Same as That Integer Exists in Array or Not.