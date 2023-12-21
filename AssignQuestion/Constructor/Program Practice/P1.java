import java.util.Scanner;

// Grow Salary
public class P1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Salary: ");
        float salary = sc.nextFloat();

    }

    public void grossSlry(float salary) {
        // Variable difines
        float da, hra, grossSlry, pf;

        hra = salary * (0.20f);
        da = salary * (0.50f);
        pf = salary * (0.11f);
        grossSlry = salary + hra + da + pf;
        System.out.println(grossSlry);

    }
}
