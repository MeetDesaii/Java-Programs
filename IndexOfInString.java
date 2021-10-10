// Take Character Input From User and Show Index Of That Character To User.

package com.CodeByMeet;
import java.util.Scanner;
public class IndexOfInString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a String : ");
        String str=sc.nextLine();
        System.out.print("Enter a Character or String To Know It's Index : ");
        String str1=sc.nextLine();
        System.out.print("Index Of That Character or String is : "+str.indexOf(str1));
    }
}

// indexOf() Takes Character or String input in It's Parenthesis.
// If We Enter Wrong input so It'll Give Result -1.