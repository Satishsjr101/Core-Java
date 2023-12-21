
/*27. Write a Java program to input basic salary of an employee and calculate its Gross salary according to following: Basic Salary <= 10000 : HRA = 20%, DA = 80% 
Basic Salary <= 20000 : HRA = 25%, DA = 90% 
Basic Salary > 20000 : HRA = 30%, DA = 95% */
import java.util.Scanner;

public class P27 {
    public static void main(String ar[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Basic Salary: ");
        float salary = sc.nextFloat();
        float dALL = 0;
        float hrentALL = 0;
        float tSalary = 0;

        if (salary <= 10000) {
            hrentALL = salary * (0.20f);
            dALL = salary * (0.80f);
        } else if (salary <= 20000) {
            hrentALL = salary * (0.25f);
            dALL = salary * (0.90f);
        } else if (salary > 20000) {
            hrentALL = salary * (0.30f);
            dALL = salary * (0.95f);
        }
        tSalary = hrentALL + dALL + salary;
        System.out.println("----------------Salary Details--------------------");
        System.out.println("Dearness Allowance : " + dALL);
        System.out.println("Rent Allowance: " + hrentALL);
        System.out.println("Total Salary: " + tSalary);

    }
}
