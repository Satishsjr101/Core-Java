/* . If it costs 1600 rs. to fence a rectangular park of length 20 m
 at the rate of 25 rs. per m², find the breadth of the park and its perimeter. 
 Also, find the area of the field */
public class P5 {
    public static void main(String[] args) {

        float areaRec, rate = 25f, cost = 1600;
        float lRec = 20f, bRec;
        // Area of rectangles
        areaRec = cost / rate;
        bRec = areaRec / lRec;
        System.out.println("Breadth: " + bRec);
        System.out.println("Total cost: " + areaRec);

    }
}
