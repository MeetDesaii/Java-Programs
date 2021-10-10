// Create an Arraylist and Apply some Commonly useful methods of Arraylist...

package com.CodeByMeet;
import java.util.*;

public class MethodsOfArraylist {
    public static void main(String[] args) {
        ArrayList <String> names = new ArrayList<>(7);       // Initial Capacity of Arraylist

        names.add("* Meet");
        names.add("* Meet - The Code Master");
        names.add("* ZEUS [GOD]");
        names.add("* God's Eye");
        names.add("* Battleground Mobile India - Ace Dominator");
        names.add("* Battleground Mobile India - Ace Master");
        names.add(1,"* CodeXBlackPearl");

        System.out.println("\n\n\t\t\t\t* Achievements are Here !\n");

        for (String name : names) {
            System.out.println(name);
        }

        System.out.println("\n\n\t\t\t\t* Methods are running Here !\n");

        System.out.println("indexOf() Method Running   -->  "+names.indexOf("* CodeXBlackPearl"));
        System.out.println("contains() Method Running  -->  "+names.contains("* Battleground Mobile India - Ace Dominator"));
        System.out.println("clone() Method Running     -->  "+names.clone());
        System.out.println("remove() Method Running    -->  "+names.remove(0));
    }
}

// For More Information of methods of Arraylist... You should visit Java Oracle Documentation...
// Important methods --> set() method, clear() method,