
//Find the area of a right angled triangle whose hypotenuse is 13 cm
// and one of its sides containing the right angle is 12 cm. 
//Find the length of the other side.
import java.lang.Math;

public class P12 {
    public static void main(String[] args) {
        double areaOfTr, base = 12;
        double hypo = 13;
        double altitude;
        // h^2=b^2+al^2;
        altitude = hypo * hypo - base * base;
        altitude = Math.sqrt(altitude);
        System.out.println("Other side: " + altitude);
        areaOfTr = (base * altitude) / 2;
        System.out.println("Area of Triangle: " + areaOfTr);
    }
}
