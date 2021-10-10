// Find The Length Of String.

package com.CodeByMeet;
import java.util.Scanner;
public class LengthOfString {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String a=str.nextLine();
        System.out.println("You Entered : "+a);
        int b=a.length();      // Command to Find Length Of String Where a is that Where We Stored Our String.
        System.out.print("Length Of Your String : "+b);
    }
}