/*How many square tiles of side 10 cm will be required to tile
 a floor measuring 800 cm by 900 cm? */
public class P29 {
    public static void main(String[] args) {
        // Square tiles
        float areaOfSq, totSq, side = 10;
        areaOfSq = side * side;
        System.out.println("Area: " + areaOfSq);
        // floor
        float areaOfFloor, l = 800, b = 900;
        areaOfFloor = l * b;
        System.out.println("Floor: " + areaOfFloor);
        // total
        totSq = areaOfFloor / areaOfSq;
        System.out.println("Total tiles required: " + totSq);
    }
}
