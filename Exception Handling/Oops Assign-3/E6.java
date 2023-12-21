/*6. Write a Java program to create a class called "Employee" with a name, job title, and salary attributes,
	 and methods to calculate and update salary.
*/
import java.util.Scanner;
class Employee {
	private String name,title;
	private double salary;
	public Employee(String name, String title, double salary) {
		this.name = name;
		this.title = title;
		this.salary = salary;
	}
	public void calculate() {
		System.out.println("\n\nName of employee : "+name);
		System.out.println("Job title : "+title);
		System.out.println("total salary = "+salary);
	}
	public double update(double salary) {
		return this.salary = salary;
	}
	 public double increment(double percentage) {
    salary = salary + salary * percentage / 100;
	return salary;
  }
}
class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in); 
		System.out.print("Enter the name of employee : ");
		String name = sc.nextLine();
		System.out.print("Enter the title of employee : ");
		String title = sc.nextLine();
		System.out.print("Enter your basic salary : ");
		double salary = sc.nextInt();
		Employee obj = new Employee(name, title, salary);
		obj.calculate();
		System.out.println("\n\t\tAfter increment of 10% salary is "+obj.increment(10));
		//obj.calculate
	}
}