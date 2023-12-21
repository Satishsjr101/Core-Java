import java.util.Scanner;

public class Bonus5per {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Salary: ");
        int salary = sc.nextInt();
        System.out.println("Enter your total year of Service : ");
        int year = sc.nextInt();
        float bonus = salary;
        if (year >= 5) {
            bonus = salary + salary * (0.05f);
        }
        System.out.println("Net Bonus Amount:- " + bonus);

    }
}
