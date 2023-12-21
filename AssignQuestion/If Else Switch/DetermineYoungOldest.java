import java.util.Scanner;

public class DetermineYoungOldest {
    public static void main(String ar[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age of person1:");
        int a = sc.nextInt();
        System.out.println("Enter age of person2:");
        int b = sc.nextInt();
        System.out.println("Enter age of person3:");
        int c = sc.nextInt();
        // Youngest age
        if (a > b && a > c) {
            System.out.println("Oldest age : " + a);
        } else if (b > a && b > c) {
            System.out.println("Oldest age : " + b);
        } else if (c > a && c > a) {
            System.out.println("Oldest age : " + c);
        }
        // oldest age
        if (a < b && a < c) {
            System.out.println("Youngest  age : " + a);
        } else if (b < a && b < c) {
            System.out.println("Youngest  age : " + b);
        } else if (c < a && c < a) {
            System.out.println("Youngest  age : " + c);
        }
    }
}
