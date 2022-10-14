package JavaClass15;

public class HondaBike {
    static int topSpeed=200;
    static int noOfTypes=2;
    String model;
    int year;

     void printTotalDistance(int noofGallons, int avrg){
        double distance=noofGallons/10;
        System.out.println("Your bike can go max "+distance+" with this much "+noofGallons);

     }

    public static void main(String[] args) {
        System.out.println(HondaBike.noOfTypes);
        HondaBike ybr =new HondaBike();
        ybr.model="ybr100";
        ybr.printTotalDistance(10, 200);


    }
}
