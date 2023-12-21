public class P23 {
    public static void main(String[] args) {
        // cuboid
        float volOfCuboid, l = 15, b = 9, h = 12, totVol;
        volOfCuboid = l * b * h;
        System.out.println("volOfCuboid " + volOfCuboid + " m cube");

        // cubical boxes of cubical side 3 cm
        float volOfCube, side = 3;
        volOfCube = side * side * side;
        System.out.println("volume of cube: " + volOfCube + " m cube");

        // total
        totVol = volOfCuboid / volOfCube;
        System.out.println("Total cubical boxes required: " + totVol);
    }
}
