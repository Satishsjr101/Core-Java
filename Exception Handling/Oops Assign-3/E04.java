// 4. Write a Java program to create a class called "Circle" with a radius attribute. You can access and modify this attribute. 
// 	Calculate the area and circumference of the circle.
import java.util.Scanner;
class Circle {
	private double radius;
	public Circle(double radius) {
		this.radius = radius;
	}
	public void set(double radius) {
		this.radius = radius;
	}
	public void area() {
		double area = 3.14*radius*radius;
		System.out.println("Area of circle = "+area);
	}
	public void circumference() {
		double circumference = 2*3.14*radius;
		System.out.println("Circumference of circle = "+circumference);
	}
}

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the radius of circle : ");
		double radius = sc.nextDouble();
		Circle obj = new Circle(radius);
		obj.area();
		obj.circumference();
		System.out.print("If you want to change the radius press 1 : ");
		int key = sc.nextInt();
		switch(key) {
			case 1:
			System.out.print("Enter the radius : ");
			double rad = sc.nextDouble();
			obj.set(rad);
			obj.area();
			obj.circumference();
			break;
			default:
			System.out.println("Invalid input ");
		}
	}
}