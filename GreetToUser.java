/* Question : Write a Java Program Which Asks The User To Enter His/Her Name And Greets Them With
                "Hello  <Name>  , Have A Good Day"  Text.                                          */

package com.CodeByMeet;
import java.util.Scanner;
public class GreetToUser {
    public static void main(String[] args) {
        System.out.print("Enter Your Name : ");
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();    //If We Wrote sc.next() So It'll Print Without Spaced String.
        System.out.println("Hello " + name + ", Have a Nice Day.");      //We can Add Like This in Java
    }
}
