package JavaClass20;

public class ProgrammingHW2 {
    /*
    Create a class named 'Programming'.
    While creating an object of the class, if nothing is passed to it, then the message "I love programming languages" should be printed.
    If some String is passed to it, then in place of "programming languages" the value variable should be printed.
     Example, if we pass "Java", then "I love Java" should be printed.
     */


    ProgrammingHW2(){

        System.out.println("I love programming languages");
    }
    ProgrammingHW2(String a){

        System.out.println("I love " + a);
    }

    public static void main(String[] args) {

        ProgrammingHW2 pass = new ProgrammingHW2();
        ProgrammingHW2 pass1= new ProgrammingHW2("Java");
    }
}
