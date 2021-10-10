// Create Interfaces in Java & Implement it in Class.

package com.CodeByMeet;

interface Phone{
    String About="Best Phone Ever";   // This is a Final Value and We Cannot Change This Value In Main Method.
    void phone();
}
interface Ram{
    void ram();
}
interface Storage{
    void storage();
}
interface Android{
    void android();
}
interface Processor{
    void processor();
}
interface Camera{
    void FrontCamera();
    void RearCamera();
}
class SmartPhone implements Ram, Storage, Android, Processor, Camera{    // implements Using for Implement interfaces.
    public void phone(){              // We Must Define This All Methods Which Declared in interfaces.
        System.out.println("Phone : One Plus");
    }
    public void ram(){
        System.out.println("RAM : 16 GB");
    }
    public void storage(){
        System.out.println("Storage : 1 TB");
    }
    public void android(){
        System.out.println("Android Version : ANDROID 11");
    }
    public void processor(){
        System.out.println("Processor : Snapdragon 888");
    }
    public void FrontCamera(){
        System.out.println("Front Camera : 256 MEGA PIXEL");
    }
    public void RearCamera(){
        System.out.println("Rear Camera : 256 MEGA PIXEL");
    }
}
public class Interfaces {
    public static void main(String[] args) {
        SmartPhone OnePlus=new SmartPhone();
        System.out.println(".........."+Phone.About+"..........");
        OnePlus.phone();
        OnePlus.ram();
        OnePlus.storage();
        OnePlus.android();
        OnePlus.processor();
        OnePlus.FrontCamera();
        OnePlus.RearCamera();
        System.out.println(".........."+Phone.About+"..........");
    }
}
// Here We Create About Phone Using Interfaces. We Created Methods in Interfaces.