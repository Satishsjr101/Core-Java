// 1. Write a Java program to create a class called "Person" with a name and age attribute. Create two instances of the "Person" class, 
// set their attributes using the constructor, and print their name and age.
import java.util.Scanner;
class Person {
	private String name;
	private int age;
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public void display() {                                                                                                                 
		System.out.println("Person Name : "+name);
		System.out.println("Person age : "+age);
	}
}
class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Name of Person : ");
		String name = sc.nextLine();
		System.out.print("Enter the age of Person : ");
		int age = sc.nextInt();
		Person obj = new Person(name,age);
		obj.display();
	}
}