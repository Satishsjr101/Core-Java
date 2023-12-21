public class RectanglePerimeter {
  public static void main(String[] args) {
    float a, b, peri;
    a = 6;
    b = 8;
    peri = 2 * (a + b);
    System.out.println("Perimeter of Rectangle is: " + peri);

    double d = a * a + b * b + 2 * a * b;

    System.out.println(d);
  }
}
