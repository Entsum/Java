package JavaClass20;

public class HW3 {

    /*
    Create 1 class with a static method that has 3 overloaded forms.
    Then call each overloaded method with specific arguments and observe result.
     */

    static void soccer(String player, int number){

        System.out.println(player +number);
    }
    static void soccer(String player, int number, int noOfGoals){
        System.out.println(player+number+noOfGoals);
    }
    static void soccer(String player){
        System.out.println(player);
    }

    public static void main(String[] args) {
        soccer("CR",7);
        soccer("CR",7,816);
        soccer("CR");
    }
}
