/* Find the cost of tiling a rectangular plot of land 300 m long and 150 m
 wide at the rate of $6 per hundred square m */
public class P4 {
    public static void main(String[] args) {

        float lRec = 300f, bRec = 150f, areaRec, total, rate = 6f;

        // Area of rectangles
        areaRec = lRec * bRec;

        total = areaRec * rate;
        float cost = total / 100;
        System.out.println("Total cost: " + cost);

    }
}
