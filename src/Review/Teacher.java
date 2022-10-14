package Review;

public class Teacher {

    String name, lName;
    int experience;
    String subject;
    double salary;

    static String school;

    /*
    How to create constructor.
    1. constructor name= className.
    2. no return type not even void.
     */

    //using below constructor we initialize instance variables (name , lastName,

     Teacher(String fName, String lName) {
         name=fName;
         String lastName = lName;


    }
    // When you create a constructor compiler is not going to create a default constructor for you.

    void print(){
        System.out.println(name+" "+ lName);
    }
}
