/*   Calculate Income Tax Paid By an Employee To The Government as per the Slabs Mentioned
      Below :

      Income slab      Tax
      2.5L - 5.0L      5 %
      5.0L - 10.0L     20 %
      Above 10.0L      30 %
  Note : There is no Tax Below 2.5L .Take Input Amount as an Input From The User.
 */

package com.CodeByMeet;
import java.util.Scanner;
public class CalculateTaxFromIncome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Your Income : ");
        float a=sc.nextFloat();
        if(a<=250000){
            System.out.println("\nYou Don't Need To Pay Tax");
        }
        else if(a>250000 && a<=500000){
            float b=(a*0.05f);
            System.out.printf("\nYou Need To Pay %f Rupees Tax",b);
        }
        else if(a>500000 && a<=1000000){
            float c=(a*0.2f);
            System.out.printf("\nYou Need To Pay %f Rupees Tax",c);
        }
        else if(a>1000000){
            float d=(a*0.3f);
            System.out.printf("\nYou Need To Pay %f Rupees Tax",d);
        }
        else{
            System.out.println("Please Input Valid Input");
        }
    }
}
