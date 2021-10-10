// Convert a String In Lower & Upper Case.

package com.CodeByMeet;
import java.util.Scanner;
public class LowerUpperCaseOfString {
    public static void main(String[] args) {
        System.out.print("Enter a String : ");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        // Lower Case
        System.out.print("Lower Case String is : ");
        System.out.println(str.toLowerCase());
        //Upper Case
        System.out.print("Upper Case String is : ");
        System.out.println(str.toUpperCase());
    }
}
