/* Write a Java program to find out whether the given String is Palindrome or not.
    (A Palindrome is a Number, String or a Sequence Which Will be the same Even After You Reverse the Order.)
 */
package com.CodeByMeet;
import java.util.Scanner;
public class CheckPalindrome {
    public static void checkPalindrome(String st){
        int l=st.length();
        boolean pal=true;         // Take Initially True to Make More Easy
        for(int i=0;i<l/2;i++){
            if(st.charAt(i) != st.charAt(l-i-1)){             // Main Logic
                pal=false;
                break;
            }
        }
        System.out.print(st + " is Palindrome ? : "+pal);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a String : ");
        String str=sc.nextLine();
        checkPalindrome(str);
    }
}
