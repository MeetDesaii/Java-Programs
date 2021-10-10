// Create a Class Cylinder and Use Getters and Setters and Constructor to Get Area and Volume of Cylinder.

package com.CodeByMeet;

class Area{
    float radius;
    float height;

    Area(float radius,float height){
        this.radius=radius;
        this.height=height;
    }

    public float getArea(){
        return (float) (2*Math.PI*radius*(height+radius));
    }
}

class Volume{
    float radius;
    float height;

    Volume(float radius,float height){
        this.radius=radius;
        this.height=height;
    }

    public float getVolume(){
        return (float) (Math.PI*radius*radius*height);
    }
}

public class CylinderUsingClasses {
    public static void main(String[] args) {
        Area ar = new Area(6,7);
        Volume vol = new Volume(6,7);

        System.out.print("\n\nArea of Cylinder : "+ar.getArea());
        System.out.println("\nVolume of Cylinder : "+vol.getVolume()+"\n");
    }
}
