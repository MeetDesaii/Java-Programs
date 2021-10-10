// Take Two String Inputs From User and Give Output That 2 Strings are Equal or Not (With Case Sensitive).

package com.CodeByMeet;
import java.util.Scanner;
public class EqualsInString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 1st String : ");
        String str=sc.nextLine();
        System.out.print("Enter 2nd String To Check Equality : ");
        String str1=sc.nextLine();
        System.out.println(str.equals(str1));
    }
}


// equals() Method Will Give Output in True or False.
// equals() Method is Case Sensitive.