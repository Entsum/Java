package JavaClass14;

public class MethodsDemo1 {


void printHello(){
    System.out.println("Hello World");
    System.out.println("Hello Java");
    System.out.println("Hello Aladin");

}
void PrintWord(String word){
    System.out.println(word);
}
    public static void main(String[] args) {
        MethodsDemo1 obj = new MethodsDemo1();
        obj.printHello();
        obj.PrintWord("It is raining outside");
        obj.PrintWord("Why is it so cold");

    }
}
