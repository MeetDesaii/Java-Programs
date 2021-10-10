// Write a Program To Print Multiplication Table Of a Given Number N.

package com.CodeByMeet;
import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number To Print It's Multiplication Table : ");
        int n=sc.nextInt();
        System.out.print("Enter a Number Of Length Of Multiplication Table : ");
        int m=sc.nextInt();
        for(int i=1;i<=m;i++){
            System.out.printf("%d x %d = %d\n",n,i,n*i);
        }
    }
}

/* If We Want This Table in Reverse Order So We Should Write This Condition In For Loop
       for(int i=m;i>=1;i--)
 */