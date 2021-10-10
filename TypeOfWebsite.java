/*  Write a Program to find Out The Type Of Website From The URL.
            .com - Commercial Website
            .org - Organization Website
            .in - Indian Website
 */

package com.CodeByMeet;
import java.util.Scanner;
public class TypeOfWebsite {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Website : ");
        String str=sc.nextLine();
        if(str.endsWith(".com")){
            System.out.println("This is a Commercial Website");
        }
        else if(str.endsWith(".org")){
            System.out.println("This is an Organization Website");
        }
        else if(str.endsWith(".in")){
            System.out.println("This is an Indian Website");
        }
        else{
            System.out.println("Sorry ,We Haven't Data About it.");
        }
    }
}
