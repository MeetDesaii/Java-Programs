// Write a Program to Find Out Whether a Given Integer is Present in An Array or Mot.

package com.CodeByMeet;
import java.util.Scanner;
public class CheckPresenceInArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] CodeWords={3,33,333,3333,7,77,777,7777,37,3377};
        System.out.print("Enter a CodeWord And Check That it is Existing in Data or Not : ");
        int a=sc.nextInt();
        boolean isAnExisting=false;
        for(int element : CodeWords){
            if(a==element){
                isAnExisting=true;
                break;               // If Code Matched With Element So isAnExisting Becomes True and Loop Will be Closed..
            }
        }
        if(isAnExisting){
            System.out.println("Yes, That Code is Existing in Data!");
        }
        else{
            System.out.println("No, That Code isn't Existing in Data!");
        }
    }
}
