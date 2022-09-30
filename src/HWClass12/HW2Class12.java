package HWClass12;

public class HW2Class12 {
    public static void main(String[] args) {


        /*
       Create a String and print it in reverse order (Sunday → yadnuS)
         */
        String name = "Sunday";
        String reversedString = "";

        for(int i = name.length()-1; i>=0; i--){
            reversedString = reversedString + name.charAt(i);
        }
        System.out.println(reversedString);


    }
}