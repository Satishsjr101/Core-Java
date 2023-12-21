// Find the area of a triangle, sides of which are 10 cm and 9 cm and the perimeter 36 cm.
public class P6 {
    public static void main(String[] args) {
        float areaTr, s1 = 10f, s2 = 9f, s3, periOfTr = 36f;
        s3 = periOfTr - s1 - s2; // periOfTr=s1+s2+s3;
        areaTr = (s1 * s2) / 2;
        System.out.println("Area of Traingle: " + areaTr);
    }
}
