/*  How many tiles whose length and breadth are 13 cm and 7 cm respectively
 are needed to cover a rectangular region whose length and breadth are 520 cm and 140 cm?  */
public class P3 {
    public static void main(String[] args) {

        float lRec = 520f, bRec = 140f, areaRec, areaTiles, total;
        float lTiles = 13f, bTiles = 7f;

        // Area of rectangles
        areaRec = lRec * bRec;
        // Area of Tiles
        areaTiles = lTiles * bTiles;

        // Campare
        total = areaRec / areaTiles;
        System.out.println("Total Tiles want: " + total);
    }
}
