// Create a Java Program to Guess a Number and That Number is Right With Computer Guessed or Not?

package com.CodeByMeet;
import java.util.Random;
import java.util.Scanner;

class Game{              // Custom Class
    public int Number;              // Actual Number
    public int noOfGuesses = 0;     // Number of Guessing Initially 0
    public int inputNumber;         // User's Number

    // Getter & Setter is Important to Get Perfect NoOfGuesses
    public int getNoOfGuesses(){                        // Getter of noOfGuesses
        return noOfGuesses;
    }
    public void setNoOfGuesses(int noOfGuesses){        // Setter of noOfGuesses
        this.noOfGuesses = noOfGuesses;
    }

    // For Random Number Choosing (Constructor)
    Game(){
        Random random=new Random();
        this.Number=random.nextInt(100);
    }
    void takeUserInput(){            // Method to take Input from User
        Scanner sc=new Scanner(System.in);
        System.out.print("\nGuess The Number : ");
        inputNumber = sc.nextInt();
    }
    boolean isCorrectNumber(){       // Method to check That entered Number is Correct or Not?
        noOfGuesses++;
        if(inputNumber==Number){
            System.out.printf("\nYes, You Guessed Right Number, It Was %d. \nYou Guessed it in %d Attempts.",inputNumber,noOfGuesses);
            return true;
        }
        else if(inputNumber<Number){
            System.out.println("Increase Your Number...");
        }
        else{
            System.out.println("Decrease Your Number...");
        }
        return false;
    }
}
public class GuessANumberGame {
    public static void main(String[] args) {
        System.out.println("\nWelcome in Guess A Number Master Game !!!");
        Game GM=new Game();       // Instantiating a New Game Object
        boolean b=false;          // Initialize Value of b
        while(!b){
            GM.takeUserInput();
            b = GM.isCorrectNumber();
        }
    }
}

// We can Create this Program without Using getters and setters, But this is Important to get Perfect Result.