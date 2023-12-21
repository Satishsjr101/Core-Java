import java.util.Scanner;

public class SimpleInterest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principle Amount:");

        float p = sc.nextInt();
        float r = sc.nextInt();
        float t = sc.nextInt();

        float si = (p * t * r) / 100;
        System.out.println("Simple interest = " + si);
    }

}
