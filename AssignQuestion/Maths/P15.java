public class P15 {
    public static void main(String[] args) {
        // Rectangle
        float areaOfRec, l = 22, b = 15, t;
        areaOfRec = l * b;
        System.out.println("Rectangle: " + areaOfRec);

        // Square
        float areaOfSq, side = 21;
        areaOfSq = side * side;
        System.out.println("Square: " + areaOfSq);

        if (areaOfRec > areaOfSq) {
            t = areaOfRec - areaOfSq;
            System.out.println("Shelly garden is biggest: " + areaOfRec);
            System.out.println("By " + t + " meter sq");
        } else if (areaOfSq > areaOfRec) {
            t = areaOfSq - areaOfRec;
            System.out.println("Rachel garden is biggest: " + areaOfSq);
            System.out.println("By " + t + " meter sq");
        }

    }
}
