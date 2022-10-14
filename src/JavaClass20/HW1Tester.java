package JavaClass20;

import java.awt.geom.Area;

import static JavaClass20.HW1.calculateArea;
import static JavaClass20.HW1.calculateVolume;

public class HW1Tester {
    public static void main(String[] args) {

        Area rectangle = new Area();
        calculateArea(7, 7);
        Area square=new Area();
        calculateArea(9);
        Area box=new Area();
        calculateVolume(5,7,9);
    }
}
