/* A rectangular garden has dimensions of 30 m by 20 m and is divided in
 to 4 parts by two pathways that run perpendicular from its sides. 
One pathway has a width of 3 m and the other, 4 m.
Calculate the total usable area of the garden.   */
public class P33 {
    public static void main(String[] args) {
        float areaOfRecGarden, l = 20, b = 30, tot;
        areaOfRecGarden = l * b;
        System.out.println("Area Of Garden: " + areaOfRecGarden);
        float areaPathway, lpath = 3, bpath = 4;
        areaPathway = lpath * bpath;
        System.out.println("Area of Pathways: " + areaPathway);
        tot = areaOfRecGarden - areaPathway * 2;
        System.out.println("Total usable are of garden: " + tot + " m sq");

    }
}
