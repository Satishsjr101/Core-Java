import java.util.Scanner;

// Grow Salary
public class P1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Salary: ");
        float salary = sc.nextFloat();
        System.out.print("Enter grades(A/B/C): ");
        char grade = sc.next().charAt(0);
        new P1().grossSlry(salary, grade);
        sc.close();
    }

    public void grossSlry(float salary, char grade) {
        // Variable difines
        float da, hra, grossSlry, pf, allow = 0;

        hra = salary * (0.20f);
        da = salary * (0.50f);
        pf = salary * (0.11f);

        if (grade == 'A')
            allow = 1700f;
        else if (grade == 'B')
            allow = 1500f;
        else if (grade == 'C')
            allow = 1300f;

        grossSlry = salary + hra + da + allow - pf;
        System.out.println("Gross Salary: " + grossSlry);
    }
}
