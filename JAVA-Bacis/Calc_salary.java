import java.util.*;

public class Calc_salary {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entger Salary:");
        float salary = sc.nextFloat();
        gross_salary(salary);
    }

    public static void gross_salary(Float salary) {

        double dearness_allow = salary * (0.40);
        double rent_allow = salary * 0.20;
        double total_salary = salary + dearness_allow + rent_allow;
        System.out.println("---------------------------------------------------");
        System.out.println("Salary of Ramesh:" + salary + " Rs.");
        System.out.println("Dearness allowance 40% of Salary:" + dearness_allow + " Rs.");
        System.out.println("Rent allowance 20% of Salary:" + rent_allow + " Rs.");
        System.out.println("Gross Salary of Ramesh:" + total_salary + " Rs.");
        System.out.println("---------------------------------------------------");
    }
}