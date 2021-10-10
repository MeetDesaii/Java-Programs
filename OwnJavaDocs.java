// Create a java program to create our own JavaDocs like Java Documentation using Javadoc Tool...

package com.CodeByMeet;
import java.util.Scanner;

/** You are here in CodeXBlackPearl's Own JavaDocs ...
 * @author Meet Desai
 * @version 3.3
 * @since 2002
 * @see  "* Welcome in the Meet Desai's Java Documentation..."
 */

public class OwnJavaDocs {

    /** This Function taking input for first number ...
     *
     * @param a --> Taking input for float a ...
     */

    public static void firstInput(float a){
        System.out.println(a + " has been taken...");
    }

    /** This Function taking input for second number ...
     *
     * @param b --> Taking input for float b ...
     */

    public static void secondInput(float b){
        System.out.println(b + " has been taken...");
    }

    /** This Function returns value of a*b in float ...
     *
     * @param a --> first float number (a) ...
     * @param b --> Second float number (b) ...
     * @return --> returns a float value of a*b ...
     */

    public static float multiplicationOutput(float a, float b){
        return a*b;
    }

    /** Main Method Created to understand fundamentals about to create Own JavaDocs ...
     *
     * @param args --> Taking input of a and b by using methods and giving output of a*b in float ...
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter a first number : ");
        float a = sc.nextFloat();
        firstInput(a);
        System.out.print("\nEnter a second number : ");
        float b = sc.nextFloat();
        secondInput(b);

        System.out.printf("\nMultiplication of %f and %f is %f",a,b,multiplicationOutput(a,b));
    }
}

// Generate JavaDocs from Tools ...
