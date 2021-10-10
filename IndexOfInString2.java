/* [Take Character or String Input] & [Int Input] That Show From Where User Want to Start Search,
    Show Index Of That Character To User.
 */
package com.CodeByMeet;
import java.util.Scanner;
public class IndexOfInString2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a String : ");
        String str=sc.nextLine();
        System.out.print("Enter a Character or String To Know It's Index : ");
        String str1=sc.nextLine();
        System.out.print("Enter a Number From Where You Want to Start Search : ");
        int a=sc.nextInt();
        System.out.println("Index Of That Character or String is : "+str.indexOf(str1,a));
    }
}

// If User Inputs Wrong So It'll Give Result -1.
