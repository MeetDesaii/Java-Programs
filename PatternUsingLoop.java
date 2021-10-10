/*   Write a Program To Print Following Pattern.
           *****
           ****
           ***
           **
           *
 */

package com.CodeByMeet;
public class PatternUsingLoop {
    public static void main(String[] args) {
        System.out.println("This Pattern Topic is So Crazy!   ;)");
        for(int i=4;i>=0;i--){          // Decrementing For Loop
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}

// Use Incrementing and Decrementing From Pattern Design.