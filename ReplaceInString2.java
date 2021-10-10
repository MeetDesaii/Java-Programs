// Write a Java Program To Replace Spaces With Underscores.

package com.CodeByMeet;
import java.util.Scanner;
public class ReplaceInString2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Name : ");
        String name=sc.nextLine();
        System.out.println("Your User Name is : "+name.replace(" ","_"));
    }
}
