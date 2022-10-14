package HWClass12;

public class HW1Class12 {
    public static void main(String[] args) {


        /*
        Create a String and if the String is not empty perform the following:
        if the String has an odd number of characters and has 3 or more characters,
        print the character in the middle of the String.
         */
        String str = "Hello";
        int length=str.length();
        if(!str.isEmpty() && length >= 3){

            int middleIndex=length/2;
            System.out.println(str.charAt(middleIndex));

        }

    }
}
