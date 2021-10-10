/* Use Try - Catch to solve Arithmetic Exception.
   (Use Try-Catch to solve Exceptions like ArithmeticException or ArrayOutOfBoundException, etc.
   Try will try to run that but if it is not valid so catch will catch Exception and will show which we want.)
 */

package com.CodeByMeet;
import java.util.Scanner;

public class ArithmeticException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter 1st Number : ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd Number : ");
        int b = sc.nextInt();

        try{                                // --> Use of Try-Catch
            int c = a/b;
            System.out.printf("\nDivision of %d and %d is %d\n",a,b,c);
        }
        catch (java.lang.ArithmeticException e){
            System.out.println("\nThis is not Valid ("+e+")");
        }
    }
}
