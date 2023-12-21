// 3. Write a Java program to create a class called "Rectangle" with width and height attributes. Calculate the area and perimeter of the rectangle.
import java.util.Scanner;
class Rectangle {
	private int width,height;
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	public void area() {
		int area = height*width;
		System.out.println("Area of Rectangle = "+area);
	}
	public void perimeter() {
		int perimeter = 2*(height+width);
		System.out.println("Area of perimeter = "+perimeter);
	}
}

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the width of rectangle : ");
		int width = sc.nextInt();
		System.out.print("Enter the height of rectangle : ");
		int height = sc.nextInt();
		Rectangle obj = new Rectangle(width, height);
		obj.area();
		obj.perimeter();
	}
}