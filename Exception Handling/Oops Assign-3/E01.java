// 2. Write a Java program to create a class called "Dog" with a name and breed attribute. Create two instances of the "Dog" class, 
// set their attributes using the constructor and modify the attributes using the setter methods and print the updated values.
import java.util.Scanner;
class Dog {
	private String name,breed;
	public Dog(String name, String breed) {
		this.name = name;
		this.breed = breed;
	}
	public void setterName(String name) {
		this.name = name;
	}
	public void setterBreed(String breed) {
		this.breed = breed;
	}
	public void display() {
		System.out.println("Name of Dog : "+name);
		System.out.println("Name of breed : "+breed);
	}
}

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Name of Dog : ");
		String name = sc.nextLine();
		System.out.println("Enter the Breed of Dog : ");
		String breed = sc.nextLine();
		Dog obj = new Dog(name, breed);
		obj.display();
		obj.setterName("Tommy");
		obj.display();
	}
}