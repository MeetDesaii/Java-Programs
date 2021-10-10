// Create a java program based on Registration and Log in System and use ArrayList to store Data...

package com.CodeByMeet;
import java.util.ArrayList;
import java.util.Scanner;

public class RegistrationAndLogInSystem {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> userName = new ArrayList<>();
        ArrayList<Integer> passWord = new ArrayList<>();

        // Registration...

        System.out.println("\n\nRegistration...\n");
        System.out.print("Create an Username : ");
        int createUser = sc.nextInt();
        userName.add(createUser);

        System.out.print("Create a Password : ");
        int createPassword = sc.nextInt();
        passWord.add(createPassword);
        System.out.println("Registered Successfully...");

        // Log in...

        System.out.println("\n\nLog in...\n");
        System.out.print("Username : ");
        int username = sc.nextInt();

        System.out.print("Password : ");
        int password = sc.nextInt();

        if((userName.get(0) == username) && (passWord.get(0) == password)){
            System.out.println("Logged in successfully...");
        }
        else{
            System.out.println("Try Again...");
        }
    }
}