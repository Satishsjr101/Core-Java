//7) WAP to check whether entered number is prime or not

import java.util.Scanner;

public class P7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Eneter a number: ");
        int n = sc.nextInt();
        new P7().printPrimeNo(n);
        sc.close();
    }

    public void printPrimeNo(int n) {
        int count = 0;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                count++;
                break;
            }
        }
        if (n == 1)
            System.out.print(n + " is composite number");
        else if (count == 1)
            System.out.println(n + " is not a prime number");
        else
            System.out.println(n + " is Prime number");
    }
}
