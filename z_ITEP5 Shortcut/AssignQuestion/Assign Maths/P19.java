public class P19 {
    public static void main(String[] args) {
        // cube
        float volOfCube, edge = 7;
        volOfCube = edge * edge * edge;
        System.out.println("volOfCube " + volOfCube);

        // cuboid
        float volOfCuboid, l = 7, b = 4, h = 8;
        volOfCuboid = l * b * h;
        System.out.println("volOfCuboid " + volOfCuboid);

        if (volOfCube > volOfCuboid) {
            System.out.println("Cube has more volume..");
        } else if (volOfCuboid > volOfCube) {
            System.out.println("Cuboid has more volume..");
        }
    }
}
