// Read from a created file in Java...

package com.CodeByMeet;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileHandling_ReadInFile {
    public static void main(String[] args){

        try {
            File file = new File("File Handling_Write in File.txt");
            Scanner sc = new Scanner(file);
            while(sc.hasNextLine()){
                String str = sc.nextLine();
                System.out.println(str);
            }
            sc.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}

// We can read from a file using java like this program...
