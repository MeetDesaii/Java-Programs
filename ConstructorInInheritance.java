// Create a Program of Constructor and Constructor Overloading in Inheritance.

package com.CodeByMeet;

class Base{
    Base(){
        System.out.println("I Am a Base Constructor [NULL]...");
    }
    Base(int x){
        System.out.println("I Am a Base Constructor with Value of "+x);
    }
}

class Derived extends Base{
    Derived(){
        System.out.println("I Am a Derived Constructor [NULL]...");
    }
    Derived(int x,int y){
        super(x);       // Super Keyword Using for Take Program in Its Super Class Using Within Argument.
        System.out.println("I Am a Derived Constructor with Value of "+y);
    }
}

class ChildOfDerived extends Derived{
    ChildOfDerived(){
        System.out.println("I Am a Child of Derived Constructor [NULL]...");
    }
    ChildOfDerived(int x,int y,int z){
        super(x,y);     // If We Are not Using Super Keyword So Program Will Take Constructor Which Arguments are NULL.
        System.out.println("I Am a Child of Derived Constructor with Value of "+z);
    }
}

public class ConstructorInInheritance {
    public static void main(String[] args) {
        ChildOfDerived CD=new ChildOfDerived(7,18,45);
    }
}
