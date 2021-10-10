/* Print Below Type of Pattern Using Recursion :
     *
     * *
     * * *
     * * * *
 */

package com.CodeByMeet;
import java.util.Scanner;
public class PatternUsingRecursion {
    static void pattern(int n){
        if(n>0){
            pattern(n-1);
            for(int i=0; i<n; i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number That How Many Lines You Want To Print in Pattern : ");
        int a=sc.nextInt();
        pattern(a);
    }
}
