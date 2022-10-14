package JavaClass20;

public class Task2 {

    /*
    Write program to inherit class T that has method printF which is static
    and call or reuse that method into class W
     */

    public static void main(String[] args) {
        T.printF();
        W.printF();
    }
}
class T{

   static void printF(){
       System.out.println("T");
    }
}
class W extends T{

}