package JavaClass13;

public class Task6HW {
    public static void main(String[] args) {
//How would you swap  2 strings without a temporary variable?

        String i = "sport";
        String j = "soccer";
        System.out.println(i + " " + j);
        i = i + j;
        j = i.substring(0, i.length() - j.length());
        i = i.substring(j.length());
        System.out.println(i + " " + j);
    }
}
