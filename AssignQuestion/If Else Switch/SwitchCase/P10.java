
//Print number between 1 to 5 in word format
import java.util.Scanner;

public class P10 {
    public static void main(String ar[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  Number: ");
        int n = sc.nextInt();

        switch (n) {
            case 1: {
                System.out.println("one");
                break;
            }
            case 2: {
                System.out.println("Two");
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
