import java.util.Scanner;

public class A1 {
    public static void main(String[] args) {
        int r = 0, c = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows: ");
        r = sc.nextInt();
        System.out.println("Enter columns: ");
        c = sc.nextInt();
        int[][] jarr = new int[r][c];

        for (int i = 0; i < jarr.length; i++) {
            for (int j = 0; j < jarr[i].length; j++) {
                System.out.println("Enter element: ");
                jarr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < jarr.length; i++) {
            for (int j = 0; j < jarr[i].length; j++) {
                System.out.print(jarr[i][j] + " ");
            }
            System.out.println();
        }
    }
}