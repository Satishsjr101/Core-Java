import java.lang.Math;

public class P11 {
    public static void main(String[] args) {
        float areaOfTr = 320;
        double h = 5;
        double b = 8;
        double x = 1f;
        // areaOfTr=(h*b)/2;
        // area=(h*x*b*x)/2;
        x = (2d * areaOfTr) / b * h;
        System.out.println("x      " + x);
        x = Math.sqrt(x);
        b = b * x;
        h = h * x;
        System.out.println("Height: " + h);
        System.out.println("Breadth: " + b);
    }
}
