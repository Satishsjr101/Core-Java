// 9. Write a Java program to create a class called "Employee" with a name, salary, and hire date attributes, and a method to calculate years of service.
import java.time.LocalDate;
import java.time.Period;
class Employee {
	private String name;
	private int salary;
	private LocalDate hire_date;
	public Employee(String name, int salary, LocalDate hire_date) {
		this.name = name;
		this.salary = salary; 
		this.hire_date = hire_date;
	}
	
	public int calculate() {
    return Period.between(hire_date, LocalDate.now()).getYears();
  }
	public void displayInfo() {
		System.out.println("Employee name : "+name);
		System.out.println("Employee salary : "+salary);
		System.out.println("Hired date : "+hire_date);
	}
}
class Main {
	public static void main(String args[]) {
		Employee emp1 = new Employee("Harshit",54000,LocalDate.parse("2015-04-01"));
		emp1.displayInfo();
		System.out.println("Year of service = "+emp1.calculate());
		Employee emp2 = new Employee("Rahul",15000,LocalDate.parse("2021-04-01"));
		emp2.displayInfo();
		System.out.println("Year of service = "+emp2.calculate());
	}
}