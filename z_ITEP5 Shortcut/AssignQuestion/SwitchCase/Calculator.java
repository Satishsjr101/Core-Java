import java.util.Scanner;

public class Calculator {
    public static void main(String ar[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choise ( + , - , / , * ):");
        char ch = sc.next().charAt(0);
        System.out.print("Enter number1: ");
        float n1 = sc.nextFloat();
        System.out.print("Enter number2: ");
        float n2 = sc.nextFloat();

        float add = 0, sub = 0, div = 0, multi = 0;
        switch (ch) {
            case '+':
                add = n1 + n2;
                System.out.println("Addition: " + add);
                break;

            case '-':
                sub = n1 - n2;
                System.out.println("Subtraction: " + sub);
                break;
            case '/':
                div = n1 / n2;
                System.out.println("Divide: " + div);
                break;
            case '*':
                multi = n1 * n2;
                System.out.println("Multiply: " + multi);
                break;
            default:
                System.out.println("Invalid input..");
        }
    }
}
