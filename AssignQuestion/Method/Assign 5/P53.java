
// 53) WAP to print all the strong numbers between two entered numbers
import java.util.Scanner;

public class P53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number ");
        int n1 = sc.nextInt();
        System.out.println("Enter Second Number ");
        int n2 = sc.nextInt();
        int fact, temp = 0, rem;
        int sum = 0;
        for (int i = n1; i <= n2; i++) {
            temp = i;
            sum = 0;
            while (temp != 0) {
                rem = temp % 10;
                fact = 1;
                for (int j = 1; j <= rem; j++) {
                    fact = fact * j;
                }
                sum = sum + fact;
                temp = temp / 10;

                if (i == sum) {
                    System.out.println(i + " is Strong Number");
                }

            }

        }

    }
}
