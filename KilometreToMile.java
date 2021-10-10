// Question : Write a Java Program To Convert Kilometres To Miles .

package com.CodeByMeet;
import java.util.Scanner;
public class KilometreToMile {
    public static void main(String[] args) {
        Scanner km=new Scanner(System.in);
        System.out.print("Enter Distance in Kilometre : ");
        float a=km.nextFloat();
        float b=0.621f*a;           //Must Use Literal For Float
        System.out.println("Your Converted Distance in Mile is : "+b);
    }
}
