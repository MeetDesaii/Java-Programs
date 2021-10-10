// Check That Which Character On That Index Which Entered By User.

package com.CodeByMeet;
import java.util.Scanner;
public class CharAtInString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a String : ");
        String str=sc.nextLine();
        System.out.print("Enter Index : ");
        int a=sc.nextInt();
        System.out.print("Character On That Index is : "+str.charAt(a));
    }
}

// charAt() Will Take Integer Value in It's Parenthesis.