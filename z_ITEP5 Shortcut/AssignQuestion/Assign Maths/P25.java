public class P25 {
    public static void main(String[] args) {
        // bricks
        float areaOfBricks, areaCovered, totBricks = 100, l = 24f, b = 15f;

        areaOfBricks = l * b;
        areaCovered = totBricks * areaOfBricks;
        System.out.println("total area of the path  made using 100 bricks: " + areaCovered + " m sq");

    }
}
