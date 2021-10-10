// Create a Java Program To Do Method Overriding.

package com.CodeByMeet;

class A{
    public void MD(){
        System.out.println("Here, Meet Desai is Present in Class A...");
    }
    public void AB(){
        System.out.println("Here, Ankul Borada is Present in Class A...");
    }
}
class B extends A{                 // Same Method in Different Class is Called Method Overriding.
    public void MD(){            // Same Method With Same Para Meter And ReturnType but Class is Different is Called Method Overriding.
        System.out.println("Here, Meet Desai is Present in Class B...");
    }
    public void AB(){
        System.out.println("Here, Ankul Borada is Present in Class B...");
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        A a=new A();
        a.MD();
        B b=new B();
        a.AB();
        b.MD();
    }
}
/* Here If We are Doing Object Instantiation A a=new B(); so it Called Dynamic Method Dispatch.
   For Example, If are Creating Phone And Smartphone Class So We can Call Smartphone within Using of Phone.
   Super a = new Sub(); --> Format
 */