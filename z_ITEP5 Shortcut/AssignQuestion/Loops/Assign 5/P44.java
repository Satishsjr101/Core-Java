// 44) WAP to interchange first and last digit of a number

import java.util.Scanner;

public class P44 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no to interchange first and last digit...");
        int x = sc.nextInt();
        int number = x;
        int last_digit = 0, first_digit = 0, rem = 0, count = 0, result = 0;
        int count2 = 0, mid_digit = 0;

        last_digit = (x % 10);
        while (x != 0) {
            rem = x % 10;
            x /= 10;
            count++;
        }
        first_digit = rem;

        while ((count - 1) != 0) {
            first_digit *= 10;
            count--;
        }

        mid_digit = (number % first_digit) / 10;
        mid_digit *= 10;
        while (number != 0) {
            number /= 10;
            count2++;
        }

        while ((count2 - 1) != 0) {
            last_digit *= 10;
            first_digit /= 10;
            count2--;
        }

        result = last_digit + mid_digit + first_digit;
        System.out.println("Interchange digit: " + result);

    }
}
