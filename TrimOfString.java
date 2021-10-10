// Trim String Which Entered by User.

package com.CodeByMeet;
import java.util.Scanner;
public class TrimOfString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a String : ");
        String a=sc.nextLine();
        System.out.println("Non-Trimmed String is : "+a);
        System.out.println("Trimmed String is : "+a.trim());
    }
}

// Trim Means It'll Remove All Spaces Which is Before and After Of String.