import java.util.Scanner;

import javax.sound.midi.Synthesizer;

public class grossSalary {
    public static void main(String ar[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Salary: ");
        float Salary = sc.nextInt();
        float DALL = Salary * (0.40f);
        float RentALL = Salary * (0.20f);
        float TSalary = Salary + DALL + RentALL;
        System.out.println("------------------------------------");
        System.out.println("Salary Details");
        System.out.println("basic salary: " + Salary);
        System.out.println("Dearness Allowance : " + DALL);
        System.out.println("Rent Allowance: " + RentALL);
        System.out.println("Total Salary:" + TSalary);

    }
}
