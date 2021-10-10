// Create a Class Square with a Method to Initialize its Side, Calculating Area, Perimeter, etc.

package com.CodeByMeet;
class Square{
    int Side;
    public int Area(){          // Method
        return Side*Side;
    }
    public int Perimeter(){     // Method
        return 4*Side;
    }
}
public class CustomClassSquare {
    public static void main(String[] args) {
        Square SQ=new Square();      // Instantiating a new Square Object

        SQ.Side=10;
        // Printing Attributes
        System.out.println("Area Of Square : "+SQ.Area());
        System.out.println("Perimeter of Square : "+SQ.Perimeter());
    }
}
