// Do Sum and Average of Given Array & Create the Array in java...

package com.CodeByMeet;
public class BasicOfArray {
    public static void main(String[] args){
        int [] marks= new int [5];            // Declaration of Array
        int sum=0;
        marks[0]=100;
        marks[1]=98;
        marks[2]=99;
        marks[3]=89;
        marks[4]=95;
        for(int element : marks){               // We Used For Each Loop Where We Storing Marks In Element.
            System.out.println("Your Marks are : "+element);
            sum=sum+element;
        }
        System.out.println("Sum of These Marks are : "+sum);
        System.out.println("Your Average is : "+sum/marks.length);
    }
}

