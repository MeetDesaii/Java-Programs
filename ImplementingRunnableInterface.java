// Create a java program of Implementation of Runnable Interface.

package com.CodeByMeet;

class MyThread1 implements Runnable{                  // Implementation of Runnable Interface
    public void run(){                     // Must implement this method otherwise do abstract to that class...
        int i=0;
        while(i<=50){
            System.out.println("Hello, I am first Thread of first Interface...");
            i++;
        }
    }
}

class MyThread2 implements Runnable{                  // Implementation of Runnable Interface
    public void run(){                     // Must implement this method otherwise do abstract to that class...
        int i=0;
        while(i<=50){
            System.out.println("Hello, I am second Thread of second Interface...");
            i++;
        }
    }
}
public class ImplementingRunnableInterface {
    public static void main(String[] args) {
        MyThread1 m1 = new MyThread1();
        Thread t1 = new Thread(m1);             // Like this way we need to put value

        MyThread2 m2 = new MyThread2();
        Thread t2 = new Thread(m2);             // Like this way we need to put value

        t1.start();         // If we wrote m1.start(); and m2.start(); so it will throw an error...
        t2.start();
    }
}
