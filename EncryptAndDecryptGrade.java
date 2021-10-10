// Write a Java Program To Encrypt a Grade By Adding 8 To It. Decrypt It To Show The Correct Grade.

package com.CodeByMeet;
public class EncryptAndDecryptGrade {
    public static void main(String[] args) {

        // Encrypting
        char grade='A';
        grade=(char)(grade+8);   // Must Write (char) To Get Result of This Line In Character.
                                 // We Know That char+integer will give output integer value.
        System.out.println("Encrypted Grade is : "+grade);

        //Decrypting
        grade=(char)(grade-8);
        System.out.println("Decrypted Grade is : "+grade);
    }
}
