// Create Interfaces in Java ... And Make Like a Mobile Working like Real World...

package com.CodeByMeet;
import java.util.Scanner;

interface MyCamera{
    void takePhoto();
    void recordVideo();
}
interface MyWifi{
    String [] getNetwork();
    void connectNetwork(String S);
}

class MyCellPhone{
    void callNumber(long MobileNumber){
        System.out.println("Calling "+MobileNumber +" ...");
    }
}

class MySmartphone extends MyCellPhone implements MyCamera,MyWifi{
    public void takePhoto(){           // We Need to Make this Method Public.
        System.out.println("\nTaking a Photo...");
    }
    public void recordVideo(){
        System.out.println("\nRecording a Video...");
    }
    public String [] getNetwork(){
        System.out.println("\nGetting List of Networks...");
        String [] Connections = {"BlackPearl","God'sEye","Unlimited","Don'tUse"};
        return Connections;
    }
    public void connectNetwork(String S){
        System.out.printf("\nConnecting To %s...",S);
    }
}
public class Interfaces2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        MySmartphone OnePlus =new MySmartphone();
        OnePlus.takePhoto();
        OnePlus.recordVideo();
        System.out.print("\nEnter Your Mobile Number : ");
        long a =sc.nextLong();
        OnePlus.callNumber(a);
        String [] arr=OnePlus.getNetwork();
        for (String Item:arr) {        // For Each Loop to Print All Networks...
            System.out.println(Item);
        }
        OnePlus.connectNetwork("BlackPearl");    // Enter With Which Network You Want to Connect...
        System.out.println("\n\t\t\t\t\t\t\t\t\t\tEnjoy Your Real World With Virtual Technological World...");
        /* If We are Instantiating a new Object Like... MyCamera Cam=new MySmartphone();
         Cam.takePhoto();    --> Valid
         Cam.getNetwork();   --> Not Valid
         ...........It is Polymorphism.............
         */
    }
}
