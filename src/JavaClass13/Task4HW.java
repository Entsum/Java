package JavaClass13;

public class Task4HW {
    public static void main(String[] args) {

                //How would you reverse a String word by word? for example
                // input=>This is sentence i want to reverse
                // output=>sihT si ecnetnes i tnaw ot esrever

        StringBuilder str = new StringBuilder("This is sentence I want to reverse");
        System.out.println(str);
        str.reverse();
        System.out.println(str);
    }
}
