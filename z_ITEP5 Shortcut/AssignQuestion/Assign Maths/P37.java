
/* The surface of the cylinder is 149 cm². 
The cylinder height is 6 cm. What is the diameter of this cylinder? */
import java.lang.Math;

public class P37 {
    public static void main(String[] args) {
        float areaOfCylind = 149, pi = 22 / 7f;
        float dia, r = 1, h = 6;
        // 2 * pi * r * (h + r)
        r = (areaOfCylind / 2 * pi) - h;
        r = r;
        System.out.println("Radius: " + r);
        // System.out.println("Area of Cylindrical solid: " + areaOfCylind + " cm sq");
    }
}
