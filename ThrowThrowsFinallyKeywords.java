// Use Throw, Throws, Finally Keyword and Make Perfect Program to Explain it Clearly...

package com.CodeByMeet;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowThrowsFinallyKeywords {
    public static void main(String[] args) throws InputMismatchException{
        Scanner sc = new Scanner(System.in);
        boolean isThatValid = true;
        try{
            System.out.print("\n\nEnter Your Favourite Number : ");
            int a = sc.nextInt();
            if(a<0){
                isThatValid = false;
                throw new InputMismatchException("\nThis is not Valid in this app...");
            }
            if(isThatValid){
                System.out.println("\nYou are Valid to use This App...");
            }
        }
        catch (Exception e){
            isThatValid = false;
            System.out.println("\nThis is not Valid in this app...");
        }
        finally {
            System.out.println("Process Finished\n");
        }
    }
}