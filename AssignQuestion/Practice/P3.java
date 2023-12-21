import java.util.Scanner;

public class P3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new P3().sum();
        sc.close();
    }

    public void sum() {
        int sum = 0;

        for (int i = 101; i <= 200; i++) {
            if (i % 7 == 0)
                sum = sum + i;
        }
        System.out.println("Sum: " + sum);
    }
}
