// Create Calculator Using Switch Case.

package com.CodeByMeet;
import java.util.Scanner;
public class CalculatorUsingSwitchCase {
    public static void main(String[] args) {
        while (true) {                     // true in While's Parenthesis Shows Infinity Loop.
            Scanner sc = new Scanner(System.in);
            System.out.println("\n\n*******************************************************************************************************");
            System.out.println("\n \t\t\t\t\t\t\t\t\t\t *** Calculator ***");
            System.out.println("\n 1. ADDITION(+)");
            System.out.println(" 2. SUBTRACTION(-)");
            System.out.println(" 3. MULTIPLICATION(*)");
            System.out.println(" 4. DIVISION(/)");
            System.out.println(" 5. EXIT");
            System.out.println("\n \t\t\t\t\t\t\t\t     *** Made By MEET DESAI ***");
            System.out.println("\n*******************************************************************************************************");
            System.out.println("\n\nEnter Your Choice:");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("\nEnter 1st Number:");
                    float a = sc.nextFloat();
                    System.out.println("Enter 2nd Number:");
                    float b = sc.nextFloat();
                    float c = a + b;
                    System.out.printf("Addition Of %f and %f is %f\n", a, b, c);
                    break;

                case 2:
                    System.out.println("\n\nEnter 1st Number:");
                    float d = sc.nextFloat();
                    System.out.println("Enter 2nd Number:");
                    float e = sc.nextFloat();
                    float f = d - e;
                    System.out.printf("Subtraction Of %f and %f is %f\n", d, e, f);
                    break;

                case 3:
                    System.out.println("\n\nEnter 1st Number:");
                    float g = sc.nextFloat();
                    System.out.println("Enter 2nd Number:");
                    float h = sc.nextFloat();
                    float i = g * h;
                    System.out.printf("Multiplication Of %f and %f is %f\n", g, h, i);
                    break;

                case 4:
                    System.out.println("\n\nEnter 1st Number:");
                    float j = sc.nextFloat();
                    System.out.println("Enter 2nd Number:");
                    float k = sc.nextFloat();
                    float l = j / k;
                    System.out.printf("Division Of %f and %f is %f\n", j, k, l);
                    break;

                case 5:
                    System.exit(0);

                default:
                    System.out.println("Invalid Input");
            }
        }
    }
}

// in Java, We're Using System.exit(0);  For Exit From Program.
// Switch Case is as Same as C Language.
// break; Used To Break a Program From Switch Case.