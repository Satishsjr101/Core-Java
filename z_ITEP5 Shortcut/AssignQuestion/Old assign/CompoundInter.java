import java.util.Scanner;

public class CompoundInter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principle Amount:");
        float p = sc.nextFloat();
        System.out.println("Enter Rate:");
        float r = sc.nextFloat();
        System.out.println("Enter Time:");
        float t = sc.nextFloat();

        float si = (p * t * r) / 100;

        double ci = (p * (Math.pow((1 + r / 100), t)));
        double tot = ci - p;

        double f = tot + p;
        System.out.println("Compound Interest:" + f);

        // System.out.println("total:" + f);

    }

}
