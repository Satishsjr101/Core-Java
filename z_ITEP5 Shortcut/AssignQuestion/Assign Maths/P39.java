/* Find the surface area of cylinder if daimeter is 12 cm and its heght is 9 cm */
public class P39 {
    public static void main(String[] args) {
        float areaOfCylind, pi = 22 / 7f;
        float dia = 12, r = dia / 2, h = 9;
        areaOfCylind = 2 * pi * r * (r + h);
        System.out.println("Surface area of cylinder: " + areaOfCylind + " cm cube");
    }
}
