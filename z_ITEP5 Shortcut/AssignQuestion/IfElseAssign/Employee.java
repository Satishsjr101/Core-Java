import java.util.Scanner;

public class Employee {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        System.out.print("Enter Sex(m/f): ");
        char sex = sc.next().charAt(0);
        System.out.print("Enter Maritial Status(y/n): ");
        char m = sc.next().charAt(0);
        if (sex == 'f') {
            System.out.println("she will work only in urban areas.");
        } else {
            if (sex == 'm' && age >= 20 & age <= 40) {
                System.out.println("he may work in anywhere.");
            } else if (age >= 40 & age <= 80) {
                System.out.println("he will work in urban areas only.");
            } else if (age < 20 && age > 80) {
                System.out.println(" input of age should print ERROR.");
            }
        }
    }
}