// Create a Java Program to Add Two Matrices of Size 2X3.

package com.CodeByMeet;
public class AdditionOf2DArray {
    public static void main(String[] args) {
        System.out.println("Here You Are Seeing Addition of Two Matrices : ");
        int [][] mat1={{16,38,24},
                       {34,59,17}};          // One Type Of Method (Matrices type) To Show 2D Array.
        int [][] mat2={{64,43,93},            // This Shows us That There are 2 Rows and 3 Columns.
                       {75,82,19}};
        int [][] result=new int[2][3];

        for(int i=0;i<mat1.length;i++){                     // Row Number of Time
            for(int j=0;j<mat1[i].length;j++){              // Column Number of Time
                result[i][j]=mat1[i][j]+mat2[i][j];
                System.out.print(result[i][j] + "  ");
            }
            System.out.println();           // Prints a New Line After 1 Row.
        }
    }
}
