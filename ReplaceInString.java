// Get Character or Characters From User To Replace Character or Characters In String.

package com.CodeByMeet;
import java.util.Scanner;
public class ReplaceInString {
    public static void main(String[] args) {
        Scanner str=new Scanner(System.in);
        System.out.print("Enter a String : ");
        String rep=str.nextLine();
        System.out.print("\nEnter Character or String Where You Want To Replace : ");
        String a=str.nextLine();
        System.out.print("Enter Character or String What You Want To Replace : ");
        String b=str.nextLine();
        System.out.println("\nReplaced String is : "+rep.replace(a,b));
    }
}

// replace(a,b) means It'll Replace a With b . We can Use Character Or String in a and b .
