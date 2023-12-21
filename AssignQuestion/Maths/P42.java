// Find the Volume of Cylinder whose diameter and height are 2.25cm ? 
public class P42 {
    public static void main(String[] args) {
        float volOfCylinder, pi = 22 / 7f;
        float dia = 2.25f, r = dia / 2, h = 2.25f;
        // volume = π r² h
        volOfCylinder = pi * r * r * h;
        System.out.println("Volume of Cylinder : " + volOfCylinder + " cm cube");
    }
}
