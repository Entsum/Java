package JavaClass15;

public class Task2 {

   // Create a method that will take a number and prints whether the number is even or odd.

    void printEvenOdd(int number){

        if(number%2==0){
            System.out.println(number+" is even");
        }else {
            System.out.println(number+"is odd");
        }
    }

    public static void main(String[] args) {
        Task2 task=new Task2();
        task.printEvenOdd(45);
        task.printEvenOdd(50);
    }
}
