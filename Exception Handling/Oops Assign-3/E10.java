// 10. Write a Java program to create a class called "Student" with a name, grade, and courses attributes,
// and methods to add and remove courses.
import java.util.Scanner;
class Student {
	private String name;
	private int grade;

	public Student(String name, int grade) {
		this.name = name;
		this.grade = grade;
	}
	public void display(String course[]) {
		// int k=0;
		// for(int i=0; i<course.length; i++) {
			// courses[k] = course[i];
			// k++;
		// }
		System.out.println("Name of Student : "+name);
		System.out.println("Grades : "+grade);
		for(int i=0; i<course.length; i++) 
			System.out.println("course "+(i+1)+" = "+course[i]);
	}
}

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Student s1 = new Student("Raghav",12);
		System.out.print("Enter the number of course : ");
		int num = sc.nextInt();
		String arr[] = new String[num];
		for(int i=0; i<arr.length; i++)  {
			System.out.println("Enter the "+(i+1)+" course name ");
			arr[i] = sc.next();
		}
		s1.display(arr);
	}
}