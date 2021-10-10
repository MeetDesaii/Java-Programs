// Give Access To User To Enter Starting Index For Getting Substring Of String.

package com.CodeByMeet;
import java.util.Scanner;
public class SubstringOfString {
    public static void main(String[] args) {
       Scanner sub=new Scanner(System.in);
        System.out.print("Enter a String : ");
        String str=sub.nextLine();
        System.out.print("Enter Index For Substring : ");
        int a=sub.nextInt();
        System.out.println("You Entered : \n"+str);
        System.out.println("Your Substring : \n"+str.substring(a));
    }
}

/* Substring means One Small Part Of String By Entering Index. Index of First Character is 0
   and It is Increasing With Including of Spaces.
 */