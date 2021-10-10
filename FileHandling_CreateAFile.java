// Create a File in Java...

package com.CodeByMeet;

import java.io.File;
import java.io.IOException;

public class FileHandling_CreateAFile {
    public static void main(String[] args) throws IOException {
        File file = new File("File Handling_Create a File.txt");
        File file2 = new File("File Handling_Delete a File.txt");

        file.createNewFile();        // This method is used to create a new file...
        file2.createNewFile();
    }
}

// This is how we can Create a new File in java...