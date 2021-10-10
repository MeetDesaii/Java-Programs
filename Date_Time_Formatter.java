// Create a java program to change format of local date and time using DateTimeFormatter ...

package com.CodeByMeet;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Date_Time_Formatter {
    public static void main(String[] args) {

        LocalDateTime date = LocalDateTime.now();             // --> Giving local time and date...
        System.out.println("\n"+date+"\n");

        // Important
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy || E || h:m a");   // Modifying Pattern

        String str = date.format(df);
        System.out.println(str);
    }
}

// For more and best information, You should visit java documentation...
