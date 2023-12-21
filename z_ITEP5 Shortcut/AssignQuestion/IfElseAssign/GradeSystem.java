import java.util.Scanner;

public class GradeSystem {
    public static void main(String ar[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your marks: ");
        float marks = sc.nextFloat();
        if (marks <= 25) {
            System.out.println("F Grade");
        } else if (marks >= 25 & marks <= 45) {
            System.out.println("E Grade");
        } else if (marks >= 45 & marks <= 50) {
            System.out.println("D Grade");
        } else if (marks >= 50 & marks <= 60) {
            System.out.println("C Grade");
        } else if (marks >= 60 & marks <= 80) {
            System.out.println("B Grade");
        } else if (marks >= 80) {
            System.out.println("A Grade");
        } else {
            System.out.println("Invalid marks ");
        }
    }
}
