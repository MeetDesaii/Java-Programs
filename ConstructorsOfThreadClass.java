// Add Constructors in Thread classes and define that how can we implement it and how can we get id and name.

package com.CodeByMeet;

class ThreadClass1 extends Thread{
    ThreadClass1(String name){
        super(name);                     // Must need
        System.out.println("\nThread class 1 ("+name+") has been implemented...");
    }
}

class ThreadClass2 extends Thread{
    ThreadClass2(String name){
        super(name);                     // Must need
        System.out.println("Thread class 2 ("+name+") has been implemented...");
    }
}

public class ConstructorsOfThreadClass {
    public static void main(String[] args) {
        ThreadClass1 tc1 = new ThreadClass1("Meet");
        ThreadClass2 tc2 = new ThreadClass2("CodeXBlackPearl");

        System.out.println("\nId of Thread class 1 is "+tc1.getId()+"...");
        System.out.println("Name of Thread class 1 is "+tc1.getName()+"...");
        System.out.println("\nId of Thread class 2 is "+tc2.getId()+"...");
        System.out.println("Name of Thread class 2 is "+tc2.getName()+"...");
    }
}
