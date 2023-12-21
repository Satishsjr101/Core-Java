// What is the surface area of a cylinder if the diameter is 15m height is 7m
public class P36 {
    public static void main(String args[]) {
        float areaOfCylind, pi = 22 / 7f;
        float dia = 15, r = dia / 2f, h = 7;
        areaOfCylind = 2 * pi * r * (h + r);
        System.out.println("Area of Cylindrical solid: " + areaOfCylind + " cm sq");
    }
}
