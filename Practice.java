package com.CodeByMeet;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = {1,3,5,7,9};
        System.out.print("Enter a Number : ");
        int num = sc.nextInt();

        for(int i=0 ; i<=arr.length-1 ; i++){
            if(arr[i] == num){
                System.out.println("Yes! That value is Existing in array...");
            }
            else if(arr[i] != num){
                System.out.println("No! That value is not Existing in array...");
            }
        }
    }
}
