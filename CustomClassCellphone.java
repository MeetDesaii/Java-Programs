// Create a Class Cellphone with Methods to Print "Ringing...", "Vibrating...", etc.

package com.CodeByMeet;
class Cellphone{
        public void Ring(){
            System.out.println("Ringing...");
        }
        public void Vibrate(){
            System.out.println("Vibrating...");
        }
        public void CallFriend(){
            System.out.println("Calling...");
        }
}
public class CustomClassCellphone {
    public static void main(String[] args) {
    Cellphone Samsung=new Cellphone();    // Instantiating a new Cellphone Object

    // Printing Attributes
    Samsung.Ring();
    Samsung.Vibrate();
    Samsung.CallFriend();
    }
}
/* Here We can add Conditions for Calling, Ringing, Vibrating, etc.
    For Example. When We're Calling From Whatsapp and If Receiver isn't Connects with Internet so It'll show us Calling
                 & If Receiver Connects with Internet so It'll show us Ringing.
 */