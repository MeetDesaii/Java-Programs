// Create an Abstract Class and Method in Java and clear it's Concept.

package com.CodeByMeet;
// Concept of Abstract Class and Methods.
abstract class Home{
    abstract public void Hall();
    abstract public void Kitchen();
    abstract public void Bedroom();
}
class House extends Home {   // If We are Creating Class Using Inheritance with Abstract Class So We Must Add Methods in That Class otherwise We Must Declare Abstract To That Class.
    @Override
    public void Hall() {
        System.out.println("Welcome in Hall Of Unique Family...");
    }

    public void Kitchen() {
        System.out.println("Welcome in Kitchen and Enjoy Your Life with Food...");
    }

    public void Bedroom() {
        System.out.println("Welcome in Bedroom and Take Rest Without Any Tension...");
    }
}
public class AbstractClassAndMethods {
    public static void main(String[] args) {
        House Villa=new House();
        // Home WH=new Home();  --> It Will Throw An Error.It Is not Possible To Create Object of Abstract Class.
        Villa.Hall();
        Villa.Kitchen();
        Villa.Bedroom();
    }
}
