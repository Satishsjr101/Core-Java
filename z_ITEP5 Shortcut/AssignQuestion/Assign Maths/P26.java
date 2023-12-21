public class P26 {
    public static void main(String[] args) {
        // bricks
        float areaOfBricks, totBricks, l = 0.24f, b = 0.15f;
        areaOfBricks = l * b;
        System.out.println("Bricks: " + areaOfBricks);

        // required brick
        float areaRequire, lr = 120, br = 2.4f;
        areaRequire = lr * br;
        System.out.println("Required: " + areaRequire);

        // total area required
        totBricks = areaRequire / areaOfBricks;
        System.out.println("Total Bricks requires: " + totBricks);

    }
}
