// Create a Calculator within custom Exception class and try,catch,throw,throws,finally Keywords...

package com.CodeByMeet;
import java.util.InputMismatchException;
import java.util.Scanner;

class InvalidInputException extends Exception{             // --> Custom Exception
    @Override
    public String toString() {
        return "--> Please Enter a Valid Choice...";
    }
}

class NoDivideBy0Exception extends Exception{              // --> Custom Exception
    @Override
    public String toString() {
        return "--> You cannot divide by 0...";
    }
}

public class Calculator {
    public static void main(String[] args) throws InvalidInputException,NoDivideBy0Exception{
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("\n*******************************************************************************************************");
            System.out.println("\t\t\t\t\t\t\t\t\t\t *** Calculator ***");
            System.out.println("1. ADDITION(+)");
            System.out.println("2. SUBTRACTION(-)");
            System.out.println("3. MULTIPLICATION(*)");
            System.out.println("4. DIVISION(/)");
            System.out.println("5. EXIT");
            System.out.println("\t\t\t\t\t\t\t\t  *** Powered By CodeXBlackPearl ***");
            System.out.println("*******************************************************************************************************");

            try{
                System.out.print("\nEnter Your Choice : ");
                int choice = sc.nextInt();
                
                if(choice == 0 || choice > 5){
                    try{
                        throw new InvalidInputException();
                    }
                    catch (Exception e){
                        System.out.println(e.toString());
                    }
                }

                switch (choice){
                    case 1:
                        try{
                            System.out.print("\nEnter 1st Value : ");
                            double a = sc.nextDouble();
                            System.out.print("Enter 2nd Value : ");
                            double b = sc.nextDouble();

                            double c = a+b;
                            System.out.format("Addition of %f and %f is %f\n",a,b,c);
                        }
                        catch (InputMismatchException e){
                            System.out.println("--> Please Enter a Valid Value...");
                        }
                        finally {
                            System.out.println("\n\t\t\t\t\t\t\t\t *** Thanks for using this Program ***");
                        }
                        break;

                    case 2:
                        try{
                            System.out.print("\nEnter 1st Value : ");
                            double a = sc.nextDouble();
                            System.out.print("Enter 2nd Value : ");
                            double b = sc.nextDouble();

                            double c = a-b;
                            System.out.format("Subtraction of %f and %f is %f\n",a,b,c);
                        }
                        catch (InputMismatchException e){
                            System.out.println("--> Please Enter a Valid Value...");
                        }
                        finally {
                            System.out.println("\n\t\t\t\t\t\t\t\t *** Thanks for using this Program ***");
                        }
                        break;

                    case 3:
                        try{
                            System.out.print("\nEnter 1st Value : ");
                            double a = sc.nextDouble();
                            System.out.print("Enter 2nd Value : ");
                            double b = sc.nextDouble();

                            double c = a*b;
                            System.out.format("Multiplication of %f and %f is %f\n",a,b,c);
                        }
                        catch (InputMismatchException e){
                            System.out.println("--> Please Enter a Valid Value...");
                        }
                        finally {
                            System.out.println("\n\t\t\t\t\t\t\t\t *** Thanks for using this Program ***");
                        }
                        break;

                    case 4:
                        try{
                            System.out.print("\nEnter 1st Value : ");
                            double a = sc.nextDouble();
                            System.out.print("Enter 2nd Value : ");
                            double b = sc.nextDouble();

                            if(b == 0){
                                try{
                                    throw new NoDivideBy0Exception();
                                }
                                catch (Exception e){
                                    System.out.println(e.toString());
                                }
                                break;
                            }

                            double c = a/b;
                            System.out.format("Division of %f and %f is %f\n",a,b,c);
                        }
                        catch (InputMismatchException e){
                            System.out.println("--> Please Enter a Valid Value...");
                        }
                        finally {
                            System.out.println("\n\t\t\t\t\t\t\t\t *** Thanks for using this Program ***");
                        }
                        break;

                    case 5:
                        System.out.println("\n\t\t\t\t\t\t\t\t *** Thanks for using this Program ***");
                        System.exit(0);
                }
            }
            catch(InputMismatchException e){
                System.out.println("--> Please Enter a Valid Choice...");
            }
        }
    }
}

// Complicated try-catch using in this Program...