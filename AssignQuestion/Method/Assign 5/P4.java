
//4) WAP to print table of a number.
import java.util.Scanner;

public class P4 {
    public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Eneter a number: ");
        int n = sc.nextInt();
        new P4().printTable(n);
        sc.close();
    }

    public void printTable(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n * i);
        }
    }
}
