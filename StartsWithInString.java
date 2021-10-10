// Use Of startsWith() Method.

package com.CodeByMeet;
import java.util.Scanner;
public class StartsWithInString {
    public static void main(String[] args) {
        Scanner str=new Scanner(System.in);
        System.out.print("Enter Your Name : ");
        String name=str.nextLine();
        System.out.print("Check That String Starts With : ");
        String start=str.nextLine();
        System.out.println(name.startsWith(start));
    }
}

// startsWith() Method Will Give Output Like Boolean Operator.(True/False Only)
