package JavaClass13;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
       // Create a String that will hold a sentence. Write a program to get a new String without any spaces.
        String str = "I need to go for a walk";
        str=str.replaceAll(" ", "");
        System.out.println("str = " + str);


    }
}
