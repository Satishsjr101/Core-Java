// 7 wap to search a particular number in given array and print its position

import java.util.Scanner;

public class A7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Arrays: ");
        int size = sc.nextInt();
        int num[] = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Enter Element of Arrays: ");
            num[i] = sc.nextInt();
        }
        System.out.print("Value of x: ");
        int x = sc.nextInt();
        for (int i = 0; i < size; i++) {
            if (x == num[i]) {
                System.out.println("Position of  x is " + i);
            }
        }

    }
}
