/* The cylinder has a volume of 1287. 
The base has a radius 10. What is the area of the surface of the cylinder */
public class P38 {
    public static void main(String[] args) {
        float volOfCylinder = 1287, areaOfCylind, pi = 22 / 7f;
        float r = 10, h;
        // volume = π r² h
        h = volOfCylinder / (pi * r * r);

        // Area = 2π r h + 2π r²
        areaOfCylind = 2 * pi * r * (r + h);
        System.out.println("Area of cylinder: " + areaOfCylind);
    }

}
