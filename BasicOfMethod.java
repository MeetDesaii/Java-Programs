// Create a Complicated Program To Create Method (Function) in Java.

package com.CodeByMeet;
import java.util.Scanner;
public class BasicOfMethod {
     static float logistic(float x,float y){        // Created logistic Method... Method Means One Type of Function.
        float z;                                   // static Must Need to Create Static Method & float is ReturnType.
        if((x+y)>=25){
            z=x*((x*y)+(x-y));
        }
        else{
            z=x*((x/y)+(x-y));
        }
        return z;                 // It Will Return Value Where Method (Function) Calling.
    }
    public static void main(String[] args) {
        Scanner md=new Scanner(System.in);
        System.out.print("Enter 1st Number : ");
        float a= md.nextFloat();
        System.out.print("Enter 2nd Number : ");
        float b= md.nextFloat();
        float c=logistic(a,b);                     // Method (Function) Calling
        System.out.println("Your Coupon Number is : "+c);
        if(c>=0){
            System.out.println("\nYou are Eligible to Meet Me !");
        }
        else if(c<0){
            System.out.println("\nYou are not Eligible to Meet Me !");
        }
        else{
            System.out.println("Please Enter Valid Input !");
        }
    }
}


/* Here if We Want to Use:
         int logistic(int x,int y){
         ......
         }
    So, When We're Calling Function so We Need to Write This Format!
          BasicOfMethod obj=new BasicOfMethod();
          float c=obj.logistic(a,b);
    [[as Per Above Program........]]
 */