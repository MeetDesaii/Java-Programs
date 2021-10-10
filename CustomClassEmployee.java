// Create a Custom Class in Java.

package com.CodeByMeet;
class Employee{
    int ID;
    int Salary;
    String Name;
    public void printDetails(){
        System.out.print("My ID : "+ID);
        System.out.print("\nMy Name : "+Name);
        System.out.print("\nMy Salary : "+Salary);
    }
    public int getSalary(){
        return Salary;
    }
}
public class CustomClassEmployee {
    public static void main(String[] args) {
        Employee Meet=new Employee();         // Instantiating a new Employee Object
        // Setting Attributes
        Meet.ID=7;
        Meet.Name="Meet Desai";
        Meet.Salary = 10000000;

        Meet.printDetails();      // Printing Attributes
    }
}
