public class Hemisphere {
    public static void main(String[] args) {
        double radius = 7;
        double pi = 3.14;

        double s_area = 2 * pi * radius * radius;

        double volume = (2 * pi * radius * radius) / 3;

        System.out.println("Surface Area = " + s_area);

        System.out.println("Volume = " + volume);
    }
}
