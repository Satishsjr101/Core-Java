public class P24 {
    public static void main(String[] args) {
        // cuboid
        float volOfCuboid, l = 0.25f, b = 0.10f, h = 0.75f;
        double totVol, totCost;
        volOfCuboid = l * b * h;
        System.out.println("volOfCuboid " + volOfCuboid + " m cube");

        // Wall
        double volOfWall, lwall = 20, bwall = 2, hwall = 0.75;
        volOfWall = lwall * bwall * hwall;
        System.out.println("Volume of Wall " + volOfWall + " m cube");

        // total brick
        totVol = volOfWall / volOfCuboid;
        System.out.println("Total Brickes required: " + totVol);

        // total cost
        totCost = (totVol * 900) / 1000;
        System.out.println("Total cost to build Wall: $ " + totCost + "");

    }
}
