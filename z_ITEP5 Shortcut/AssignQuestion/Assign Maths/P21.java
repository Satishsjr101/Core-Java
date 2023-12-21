public class P21 {
    public static void main(String[] args) {
        // cuboid
        float volOfCuboid, l = 15, b = 8, h = 5, totBrick;
        volOfCuboid = l * b * h;
        System.out.println("volOfCuboid: " + volOfCuboid + " meter cube");

        // Rectangle
        float bRec = 10, hRec = 8, areaOfRec;
        areaOfRec = bRec * hRec;
        System.out.println("area of rectangle: " + areaOfRec + " m sq");

        totBrick = volOfCuboid / areaOfRec;
        System.out.println("Total Bricks required: " + totBrick);

    }
}
