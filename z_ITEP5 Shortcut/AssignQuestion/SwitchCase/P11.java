
//Find even odd using switch case
import java.util.Scanner;

public class P11 {
    public static void main(String ar[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  Number: ");
        int n = sc.nextInt();

        switch (n % 2) {
            case (0): {
                System.out.println("Even number");
                break;
            }
            case 1: {
                System.out.println("Odd Numbers");
                break;
            }
            case 3: {
                System.out.println("Three");
                break;
            }
            case 4: {
                System.out.println("Four");
                break;
            }
            case 5: {
                System.out.println("Five");
                break;
            }
            default: {
                System.out.println("Invalid input");
                break;
            }
        }
    }
}
