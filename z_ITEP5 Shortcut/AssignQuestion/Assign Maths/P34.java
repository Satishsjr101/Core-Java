/* A wooded area is in the shape of a a trapezoid 
whose bases measure 128 m and 92 m and its height is 40 m. 
A 4 m wide walkway is constructed which runs perpendicular to the two bases. 
Calculate the area of the wooded area after the addition of the walkway */
public class P34 {
    public static void main(String arg[]) {
        float areaOfTrape, b1 = 128, b2 = 92, h = 40;
        areaOfTrape = (b1 + b2) * h / 2;
        System.out.println("Trapezoid: " + areaOfTrape);

        // wallway
        float areaOfWalkway, w = 4, hWalk = 40;
        float tot;
        areaOfWalkway = w * hWalk;
        System.out.println("Area  of Walkway: " + areaOfWalkway);
        // total
        tot = areaOfTrape - areaOfWalkway;
        System.out.println("wooded area after the addition of the walkway: " + tot + " m sq");

    }
}
