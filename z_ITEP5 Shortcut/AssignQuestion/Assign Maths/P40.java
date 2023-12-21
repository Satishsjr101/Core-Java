/* Calculate the volume of the cylinder: r = 5 cm, h = 9 cm */
public class P40 {
    public static void main(String[] args) {
        float volOfCylinder, pi = 22 / 7f;
        float r = 5, h = 9;
        // volume = π r² h
        volOfCylinder = pi * r * r * h;
        System.out.println("Volume of Cylinder : " + volOfCylinder + " cm cube");
    }
}
