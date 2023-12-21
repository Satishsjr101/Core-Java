// Write a Java program to test two arrays' equality.

import java.util.Arrays;

public class A5 {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 8 };
        int b[] = { 1, 2, 3, 9, 4, 8 };

        boolean eq = Arrays.equals(a, b);
        System.out.println(eq);

    }
}
