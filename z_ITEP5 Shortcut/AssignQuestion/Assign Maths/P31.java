// What will be the area of a square with perimeter 200 m ?
public class P31 {
    public static void main(String[] args) {
        // Rectangle tiles
        float areaOfSq, periOfSq = 200, side;
        // peri of sq = 4 * a;
        side = periOfSq / 4;
        areaOfSq = side * side;
        System.out.println("Side of Square: " + side);
        System.out.println("Area of  Square: " + areaOfSq + " m sq");

    }
}
