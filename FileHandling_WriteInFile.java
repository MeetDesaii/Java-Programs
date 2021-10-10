// Write in Created File and show that how it works...

package com.CodeByMeet;

import java.io.FileWriter;
import java.io.IOException;

public class FileHandling_WriteInFile {
    public static void main(String[] args) throws IOException {
        FileWriter file = new FileWriter("File Handling_Write in File.txt");
        file.write("Hello Java, Here you are doing coding with CodeXBlackPearl...\nSo ENJOY the Program !");
        file.close();
    }
}

// We can write in file using java like this program...