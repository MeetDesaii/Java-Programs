// Question : Write a Java Program To Get Result In SPI By Entering Marks out of 100.

package com.CodeByMeet;
import java.util.Scanner;
public class ResultOfSEM3 {
    public static void main(String[] args) {
        System.out.println("Hello To All, Please Enter Your Marks To Get Your Result");
        Scanner res=new Scanner(System.in);
        System.out.print("Enter Your Marks of DS out of 100 : ");
        float ds=res.nextFloat();
        System.out.print("Enter Your Marks of DBMS out of 100 : ");
        float dbms=res.nextFloat();
        System.out.print("Enter Your Marks of DF out of 100 : ");
        float df=res.nextFloat();
        System.out.print("Enter Your Marks of PS out of 100 : ");
        float ps=res.nextFloat();
        System.out.print("Enter Your Marks of ETC out of 100 : ");
        float etc=res.nextFloat();
        System.out.print("Enter Your Marks of IC out of 100 : ");
        float ic=res.nextFloat();
        float sum=ds+dbms+df+ps+etc+ic;
        float avg=sum/60;
        System.out.println("Your SPI of SEM 3 is : "+avg);
    }
}
