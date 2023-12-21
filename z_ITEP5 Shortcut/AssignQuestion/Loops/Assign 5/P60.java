// 60) WAP to print Square, Cube and Square Root of all numbers from 1 to N

import java.util.Scanner;

public class P60 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n2 = sc.nextInt();

        for (int i = 1; i <= n2; i++) {

            System.out.println("Number: " + i);

            System.out.println("Square   " + i * i);

            System.out.println("Cube :   " + i * i * i);

            System.out.println("Sq Root: " + Math.sqrt(i));

            System.out.println();

        }
    }
}
