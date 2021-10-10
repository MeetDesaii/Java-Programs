/* [Take Character or String Input] & [Int Input] That Show What is Index That's Before User Want to
     Search, Show Index Of That Character To User.
 */

package com.CodeByMeet;
import java.util.Scanner;
public class LastIndexOfInString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a String : ");
        String str=sc.nextLine();
        System.out.print("Enter a Character or String To Get It's Last Index : ");
        String str1=sc.nextLine();
        System.out.print("Enter an Index That It's Before You Want to Search : ");
        int a=sc.nextInt();
        System.out.println("Last Index of Your Entered Character or String is : "+str.lastIndexOf(str1,a));
    }
}

// If User Inputs Wrong So It'll Give Result -1.