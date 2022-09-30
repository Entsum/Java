package Review;

public class Questions {
    public static void main(String[] args) {
        // How would you reverse a string without using reverse function?

        /*
        1. Use stringBuilder and reverse method
        2. Use charAt();
        3. Use toCharArray();
         */
        String str = "hello";
        String newString="";

        for (int i=str.length()-1; i>=0; i--){

           newString = newString+str.charAt(i);
            System.out.println(newString);

        }
        String s="Class is almost over";
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        System.out.println(sb);


    }
}
