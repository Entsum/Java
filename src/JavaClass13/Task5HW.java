package JavaClass13;

public class Task5HW {
    public static void main(String[] args) {
        //How would you check if String is palindrome or not? aba=> true
        //Abbc =>false
        String str="dad";
        StringBuilder stringBuilder =new StringBuilder("dad");
        stringBuilder.reverse();
        if (stringBuilder.toString().equals(str)){
            System.out.println("The String is Palidrome");
        }else {
            System.out.println("The String is not a Palidrome");
        }
    }

    
}
