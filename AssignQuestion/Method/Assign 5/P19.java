//19) 1	+	1/2	+	1/3	+	1/4	+	1/5	….. n terms(find out sum

import java.util.Scanner;

public class P19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a nth terns: ");
        int n = sc.nextInt();
        float div = 1, sum = 0;
        for (int i = 1; i <= n; i++) {
            div = 1.0f / i;
            sum = sum + div;
        }
        System.out.println("Sum: " + sum);
    }
}
