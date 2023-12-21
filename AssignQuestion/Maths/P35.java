/* Find the surface area of the cylindrical solid whose
 radius is 7.7 cm and height is 12 cm. */
public class P35 {
    public static void main(String ard[]) {
        float areaOfCylind, r = 7.7f, h = 12, pi = 22 / 7f;
        areaOfCylind = 2 * pi * r * (h + r);
        System.out.println("Area of Cylindrical solid: " + areaOfCylind + " cm sq");
    }
}
