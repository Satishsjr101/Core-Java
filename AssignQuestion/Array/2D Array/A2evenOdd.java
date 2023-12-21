import java.util.Scanner;

public class A2evenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int r = sc.nextInt();
        System.out.print("Enter columns: ");
        int c = sc.nextInt();
        int a[][] = new int[3][2];

        for (r = 0; r < a.length; r++) {
            System.out.println("Enter " + a[r].length + " element of " + (r + 1) + "row");
            for (c = 0; c < a[r].length; c++) {
                a[r][c] = sc.nextInt();
            }
        }

        for (r = 0; r < a.length; r++) {
            for (c = 0; c < a[r].length; c++) {
                System.out.print(" " + a[r][c]);
            }
        }
    }
}
