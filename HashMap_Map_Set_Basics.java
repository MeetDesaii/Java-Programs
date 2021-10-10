/* Create a java program using HashMap , Set, Map ... and show that how it works...
   (* Give Keys and Values to Data and Access it using Set and Map and show it... *)
 */
package com.CodeByMeet;
import java.util.*;

public class HashMap_Map_Set_Basics {
    public static void main(String[] args) {

        // HashMap Working like this...
        HashMap <String,String> phoneBook = new HashMap<>();
        System.out.println("\n* Normal Output is here...");
        phoneBook.put("Meet",  "7490815485");
        phoneBook.put("Papa",  "9998335835");
        phoneBook.put("Mummy", "9016113760");
        phoneBook.put("Dada",  "9724973238");
        phoneBook.put("Preet",  "9054244884");
        System.out.println(phoneBook);


        System.out.println("\n* Keys are here...");
        Set<String> keys = phoneBook.keySet();
        for(String keyValues : keys){                 // --> for each loop
            System.out.println(keyValues);
        }


        System.out.println("\n* Keys and Values are here...");
        Set<Map.Entry<String,String>> values = phoneBook.entrySet();
        for(Map.Entry<String,String> val : values){           // --> for each loop
            System.out.println(val.getKey() + "  :  " +val.getValue());
        }
    }
}

// in HashMap we have put() method to add new data in data...
// Here we can use getKey() method to get key of data & we can use getValue() method to get value of data...