// Take Two String Inputs From User and Give Output That 2 Strings are Equal or Not (Without Case Sensitive).

package com.CodeByMeet;
import java.util.Scanner;
public class EqualsIgnoreCaseInString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 1st String : ");
        String str=sc.nextLine();
        System.out.print("Enter 2nd String To Check Equality : ");
        String str1=sc.nextLine();
        System.out.println(str.equalsIgnoreCase(str1));
    }
}

// equalsIgnoreCase() Method Will Give Output in True or False.
// equalsIgnoreCase() Method isn't Case Sensitive.