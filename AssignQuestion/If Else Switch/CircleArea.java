import java.util.Scanner;

class CircleArea {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius: ");
        float r = sc.nextFloat();
        double pi = 3.14;

        double area = pi * r * r;

        System.out.println("Area Of Circle:" + area);
    }
}