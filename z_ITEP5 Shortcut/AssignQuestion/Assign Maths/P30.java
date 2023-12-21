/*How many tiles of length 5 cm and breadth 8 cm 
are needed to tile the floor of a bed room 200 cm long and 400 cm wide? */
public class P30 {

    public static void main(String[] args) {
        // Rectangle tiles
        float areaOfRec, tot, l = 5, b = 8;
        areaOfRec = l * b;

        System.out.println("Area: " + areaOfRec);
        // floor
        float areaOfFloor, lfloor = 200, bfloor = 400;
        areaOfFloor = lfloor * bfloor;
        System.out.println("Floor: " + areaOfFloor);
        // total
        tot = areaOfFloor / areaOfRec;
        System.out.println("Total tiles required: " + tot);
    }
}
