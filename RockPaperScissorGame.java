/* Create a Java Program of Rock, Paper, Scissor Game Where You're User Input and Opposite side
   is Computer Input.
 */
package com.CodeByMeet;
import java.util.Scanner;
import java.util.Random;
public class RockPaperScissorGame {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("\nEnjoy Rock, Paper, Scissor Game !!!");
        System.out.println("\n\n 0 - Rock \n 1 - Paper \n 2 - Scissor ");
        System.out.print("\nEnter Your Choice : ");
        int userInput=sc.nextInt();
        if(userInput==0){
            System.out.println("\nYou Choose Rock.");
        }
        else if(userInput==1){
            System.out.println("\nYou Choose Paper.");
        }
        else if(userInput==2){
            System.out.println("\nYou Choose Scissor.");
        }
        else{
            System.out.println("\nInvalid input !!");
        }

        // Using Random
        Random random=new Random();
        int computerInput=random.nextInt(3);

        if(computerInput==0){
            System.out.println("Computer Choose Rock.");
        }
        else if(computerInput==1){
            System.out.println("Computer Choose Paper.");
        }
        else{
            System.out.println("Computer Choose Scissor.");
        }

        // Main Logic
        if(userInput==computerInput){
            System.out.println("\nThis Game is Draw !!");
        }
        else if((userInput==0 && computerInput==2) || (userInput==1 && computerInput==0) || (userInput==2 && computerInput==1)){
            System.out.println("\nYou Won This Game !!");
        }
        else{
            System.out.println("\nComputer Won This Game !!");
        }
    }
}
