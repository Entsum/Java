package HWClass12;

import java.util.Scanner;

public class HW3Class12 {
    public static void main(String[] args) {

            /*
        Write a program that reads two people's first
        names and if they expecting boy or girl?
        Based on the input suggests a name for a baby:
        Example Output:
            Mom’s first name? Mary
            Dad’s first name? Daniel
            Boy or Girl? boy
            Suggested baby name: DANRY

            Example Output:
            Mom’s first name? Mary
            Dad’s first name? Daniel
            Boy or Girl? girl
            Suggested baby name: MAIEL
         */


        Scanner input = new Scanner(System.in);
        String name;
        System.out.println("Please enter mom's name");
        String momName = input.next();
        System.out.println("Please enter dad's name");
        String dadName = input.next();
        System.out.println("Are you expecting a Boy or a Girl?");
        String gender = input.next();

        if(gender.toLowerCase().startsWith("b")){
            System.out.println("Suggested name of a boy: "+(dadName.substring(0,dadName.length()/2)+momName.substring(momName.length()/2)).toUpperCase());
        }else if(gender.toLowerCase().startsWith("g")){
            System.out.println("Suggested name of a girl: "+(momName.substring(0,momName.length()/2)+dadName.substring(dadName.length()/2)).toUpperCase());
        }else {
            System.out.println("");
        }
    }
}
