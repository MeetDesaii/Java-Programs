/* Create a package named :: package com.CodeByMeet with Classes of ThisSquare, ThisRectangle,
     ThisCircle, ThisSphere, ThisCylinder, ThisCuboid ,etc... and use Inheritance in that
     classes to get value of variables from another classes... and find their Area and
     Print Their Area One by one...
 */

package com.CodeByMeet;
import java.util.Scanner;

class ThisSquare{
    double length;

    ThisSquare(double length){
        this.length = length;
    }

    public double getArea(){
        return this.length * this.length;
    }
}

class ThisRectangle extends ThisSquare{
    double breadth;

    ThisRectangle(double length, double breadth) {
        super(length);
        this.breadth = breadth;
    }

    public double getArea(){
        return this.length * this.breadth;
    }
}

class ThisCircle {
    double radius;

    ThisCircle(double radius){
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI * this.radius * this.radius;
    }
}

class ThisSphere extends ThisCircle{
    ThisSphere(double radius){
        super(radius);
    }

    public double getArea(){
        return 4 * Math.PI * this.radius * this.radius;
    }
}

class ThisCylinder extends ThisCircle{
    double height;

    ThisCylinder(double radius, double height){
        super(radius);
        this.height = height;
    }

    public double getArea(){
        return 2 * Math.PI * this.radius * (this.height + this.radius);
    }
}

class ThisCuboid extends ThisRectangle{
    double height;

    ThisCuboid(double length, double breadth, double height){
        super(length,breadth);
        this.height = height;
    }

    public double getArea(){
        return 2 * ((this.length * this.breadth) + (this.breadth * this.height)
                                                        + (this.height * this.length));
    }
}

public class PackageOfShape {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double length, breadth, radius, height;

        System.out.print("\nEnter a Length : ");
        length = sc.nextDouble();
        System.out.print("Enter a Breadth : ");
        breadth = sc.nextDouble();
        System.out.print("Enter a Radius : ");
        radius = sc.nextDouble();
        System.out.print("Enter a height : ");
        height = sc.nextDouble();
        System.out.println("\n\t\t\t\t\t\t\t\t ******************************");
        System.out.println("\t\t\t\t\t\t\t\t   Your Results are Here ... !");
        System.out.println("\t\t\t\t\t\t\t\t ******************************");
        ThisSquare sq = new ThisSquare(length);
        System.out.println("\nArea of Square : "+sq.getArea());

        ThisRectangle rec = new ThisRectangle(length,breadth);
        System.out.println("Area of Rectangle : "+rec.getArea());

        ThisCircle cir = new ThisCircle(radius);
        System.out.println("Area of Circle : "+cir.getArea());

        ThisSphere sp = new ThisSphere(radius);
        System.out.println("Area of Sphere : "+sp.getArea());

        ThisCylinder cy = new ThisCylinder(radius,height);
        System.out.println("Area of Cylinder : "+cy.getArea());

        ThisCuboid cu = new ThisCuboid(length,breadth,height);
        System.out.println("Area of Cuboid : "+cu.getArea());
    }
}

