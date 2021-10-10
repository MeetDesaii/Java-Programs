// Create Thread and give easy way to process of program with Multiprocessing.

package com.CodeByMeet;

class Thread1 extends Thread{
    public void run(){             // Overriding a method...
        int i=0;
        while(i<=50){
            System.out.println("Thread1 is Here...");
            i++;
        }
    }
}

class Thread2 extends Thread {
    public void run() {             // Overriding a method...
        int i = 0;
        while (i <= 50) {
            System.out.println("Thread2 is Here...");
            i++;
        }
    }
}

public class ExtendingThreadClass {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();

        t1.start();                      // This is way to start a Thread...
        t2.start();
    }
}
