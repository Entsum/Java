package JavaClass20;

public class HW1 {

    /*
    Create 1 class in which create a methods that will calculate the area (volume in case of box) of
    Rectangle
    Square
    Box
    Use separate class to test your code
     */

    int area;
    int volume;
    int length;
    int height;
    int with;

    static void calculateArea(int width, int length) {
        System.out.println("Area of rectangle " + (width * length));


    }

    static void calculateArea(int length) {
        System.out.println("Area of Square " + (length * 2));
    }

    static void calculateVolume(int height, int with, int length) {
        System.out.println("Volume of a box " + (length * with * height));
    }


}

