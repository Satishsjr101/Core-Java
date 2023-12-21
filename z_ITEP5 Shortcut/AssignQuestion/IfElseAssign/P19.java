
/* W.A.P to check whether the traingle is equilateral, scalene, or isosceles.
Hint: - Isosceles triangle: In geometry, 
an isosceles triangle is a triangle that has two sides of equal length.
 Equilateral triangle: In geometry,
 an equilateral triangle is a triangle in which all three sides are equal.
 Scalene triangle: A scalene triangle is a triangle that has three unequal sides. */
import java.util.Scanner;

public class P19 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a side1: ");
        int s1 = sc.nextInt();
        System.out.print("Enter a side2: ");
        int s2 = sc.nextInt();
        System.out.print("Enter a side3: ");
        int s3 = sc.nextInt();

        if (s1 == s2 && s2 == s3 && s3 == s1) {
            System.out.println("Equilateral triangle");
        } else if (s1 != s2 && s2 != s3 && s3 != s1) {
            System.out.println("scalene triangle");
        } else if (s1 == s2 || s2 == s3 || s3 == s1) {
            System.out.println("Isosceles triangle");
        }

    }
}
