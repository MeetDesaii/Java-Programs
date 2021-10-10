// Use Of endsWith() Method.

package com.CodeByMeet;
import java.util.Scanner;
public class EndsWithInString {
    public static void main(String[] args) {
        Scanner str=new Scanner(System.in);
        System.out.print("Enter Your Name : ");
        String name=str.nextLine();
        System.out.print("Check That String Ends With : ");
        String end=str.nextLine();
        System.out.println(name.endsWith(end));
    }
}

// endsWith() Method Will Give Output Like Boolean Operator.(True/False Only)