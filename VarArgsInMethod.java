// Write a Java Program of Sum Using VarArgs.

package com.CodeByMeet;
public class VarArgsInMethod {
    static int varargs(int...arr){      // Available as int [] arr.
        int result=0;
        for(int a:arr){           // for each Loop
            result += a;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t-: This is a Program of VarArgs :-");
        System.out.print("\nSum of 1 is : "+varargs(1));
        System.out.print("\nSum of 2 and 3 is : "+varargs(2,3));
        System.out.print("\nsum of 4 and 5 and 6 is : "+varargs(4,5,6));
        System.out.print("\nSum of 7 and 8 and 9 and 10 is : "+varargs(7,8,9,10));
    }
}

// VarArgs Working like an Array...