import java.util.Scanner;

interface Shape {
    Scanner sc = new Scanner(System.in);

    void getArea();
}

class Circle implements Shape {

    public void getArea() {
        System.out.println("Enter Raduis: ");
        double r = sc.nextDouble();
        double area = (3.14) * r * r;
        System.out.println("Area of Circle: " + area);

    }
}

class Rectangle implements Shape {
    public void getArea() {
        System.out.println("Enter length: ");
        int l = sc.nextInt();

        System.out.println("Enter breadth: ");
        int b = sc.nextInt();

        int area = l * b;
        System.out.println("Area of Rectangle: " + area);

    }
}

class Traingle implements Shape {
    public void getArea() {
        System.out.println("Enter height: ");
        int h = sc.nextInt();

        System.out.println("Enter breadth: ");
        int b = sc.nextInt();

        double area = (h * b) / 2;
        System.out.println("Area of Triangle: " + area);
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle c = new Circle();
        c.getArea();
        Traingle t = new Traingle();
        t.getArea();
        Rectangle r = new Rectangle();
        r.getArea();
    }
}
