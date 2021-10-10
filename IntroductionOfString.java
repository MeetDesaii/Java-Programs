// Take input String From User & Print it Again.

package com.CodeByMeet;
import java.util.Scanner;
public class IntroductionOfString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Your Name : ");
        String name=sc.nextLine();
        System.out.println(name);
    }
}


/* Two Ways To Define String :
                1. String name="Meet";
                2. String name=new String("Meet");
 */

/* Two Different Results You Can Show When We Use Command To Take Input String From User :
                1. String name=sc.next();

                    Output :
                         Enter Your Name : Meet Desai
                         Meet

                2. String name=sc.nextLine();

                    Output :
                        Enter Your Name : Meet Desai
                        Meet Desai
 */