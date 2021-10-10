/* Create a Class Circle and Use Inheritance to Create Another Class Cylinder from It.
   And Find an Area of Circle and a Volume of Cylinder Using Inheritance.
 */

package com.CodeByMeet;
import java.util.Scanner;

class Circle{
    double radius;
    Circle(double radius){
        this.radius=radius;
    }
    public double getArea(){
        return Math.PI*this.radius*this.radius;
    }
}

class Cylinder extends Circle{
    double radius;
    double height;
    Cylinder(double radius,double height){
        super(radius);
        this.radius=radius;
        this.height=height;
    }
    public double getVolume(){
        return Math.PI*this.radius*this.radius*this.height;
    }
}

public class CircleCylinderUsingInheritance {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("\nEnter a Radius : ");
        double R=sc.nextDouble();
        System.out.print("Enter a Height : ");
        double H=sc.nextDouble();
        Cylinder CR=new Cylinder(R,H);
        System.out.print("\nArea of Circle : "+CR.getArea());
        System.out.print("\nVolume of Cylinder : "+CR.getVolume()+"\n\n");
    }
}
