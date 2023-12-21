/* A square garden with a side length of 150 m 
   has a square swimming pool in the very centre with a side length of 25 m .
   Calculate the area of the garden */
public class P32 {
    public static void main(String[] args) {
        // square garden with a side length of 150 m
        float areaOfSqGarden, side = 150, totArea;
        areaOfSqGarden = side * side;
        System.out.println("Area of  Square garden : " + areaOfSqGarden + " m sq");
        // square swimming pool
        float areaOfSqPool, sidePool = 25;
        areaOfSqPool = sidePool * sidePool;
        System.out.println("Area of  Square Swimming pool : " + areaOfSqPool + " m sq");
        // Total area
        totArea = areaOfSqGarden - areaOfSqPool;
        System.out.println("Total area of garden: " + totArea + " m sq");
    }
}
