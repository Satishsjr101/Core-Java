/*. I need to calculate the cylinder volume with a height of 50 cm
 and a diameter of 30 cm. */
public class P41 {
    public static void main(String[] args) {
        float volOfCylinder, pi = 22 / 7f;
        float dia = 30, r = dia / 2, h = 50;
        // volume = π r² h
        volOfCylinder = pi * r * r * h;
        System.out.println("Volume of Cylinder : " + volOfCylinder + " cm cube");
    }
}
