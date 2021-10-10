// Create a Custom Exception class and Print a Message when User give Wrong Inputs...

package com.CodeByMeet;
import java.util.InputMismatchException;
import java.util.Scanner;

class NoNegative extends Exception{
    @Override
    public String getMessage() {
        return "You cannot write negative value...";
    }
}

public class MyOwnException{
    public static void main(String[] args) throws NoNegative {
        Scanner sc = new Scanner(System.in);

        try{
            System.out.print("Enter a Number : ");
            int a = sc.nextInt();
            if(a<0){
                try{                              // Nested try - catch do important role in this program...
                    throw new NoNegative();
                }
                catch (Exception e){
                    System.out.println(e.getMessage());
                }
            }
        }
        catch (InputMismatchException e){
            System.out.println("This is not valid in this app...");
        }
    }
}
