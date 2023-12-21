import java.util.Scanner;

public class P16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number ");
        int n = sc.nextInt();
        int count = 0;
        for (int i = 2; i < n; i++) {

            if (n % i == 0) {
                count = 1;
                 break;
            }
           

        }
        if (count==0) {
            System.out.println("Number is a Prime " + n);
        } else {
            System.out.println("Number is not Prime " + n);
        }
    }
}
