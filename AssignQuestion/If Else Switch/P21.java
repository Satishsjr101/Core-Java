
/*Java program to check whether the triangle is valid or not if angles are given. 
Hint:- The angle property of the triangle says that the sum of all three angles
 should be equal to 180.  */
import java.util.Scanner;

public class P21 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a side1: ");
        int s1 = sc.nextInt();
        System.out.print("Enter a side2: ");
        int s2 = sc.nextInt();
        System.out.print("Enter a side3: ");
        int s3 = sc.nextInt();

        int sum = s1 + s2 + s3;
        if (sum == 180) {
            System.out.println("Yes,It is Traingle.");
        } else {
            System.out.println("No,It is Traingle.");

        }
    }
}