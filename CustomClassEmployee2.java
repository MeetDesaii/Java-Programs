/* Create a Class Employee with Following Properties and Methods.
   - Salary (Property) (int)
   - getSalary (Method Returning int)
   - Name (Property) (String)
   - getName (Method Returning String)
   - setName (Method Changing Name)
 */

package com.CodeByMeet;
class Employee1{
    int ID;
    String Name;
    int Salary;
    public void printDetails(){
        System.out.print("My ID : "+ID);
        System.out.print("\nMy Name : "+Name);
        System.out.print("\nMy Salary : "+Salary);
    }
    public int getSalary(){
        return Salary;
    }
    public String getName(){
        return Name;
    }
    public void setName(String Name1){
        Name = Name1;
    }
}
public class CustomClassEmployee2 {
    public static void main(String[] args) {
        Employee1 Meet=new Employee1();    // Instantiating a new Employee Object
        // Setting Attributes
        Meet.ID=7;
        Meet.Name="Meet Desai";
        Meet.Salary=10000000;
        Meet.setName("Meet Vipulbhai Desai");  // setName() Changing Name of Employee

        Meet.printDetails();  // Printing Attributes
    }
}
