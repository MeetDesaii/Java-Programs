// Create a Program of Inheritance.

package com.CodeByMeet;

class Parent{
    int a;

    public int getA() {
        return a;
    }
    public void setA(int a) {
        this.a = a;
    }
}

class Child extends Parent{           // Child Class Can Access Data of Parent Class.
    int b;

    public int getB() {
        return b;
    }
    public void setB(int b) {
        this.b = b;
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Parent P=new Parent();
        Child C=new Child();
        P.setA(45);
        System.out.println(P.getA());
        C.setA(7);                // We Can Use A using of Parent Class because of Inheritance.
        System.out.println(C.getA());
    }
}
