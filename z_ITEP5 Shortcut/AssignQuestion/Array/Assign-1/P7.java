import java.util.Scanner;

public class P7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  a[] = new int[5];
        int i = 0;
        System.out.println("Enter Numbers..");
        for (i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter numbers to search in Array..");
        int num = sc.nextInt();
        for (i = 0; i < 5; i++) {
            if (a[i] == num) {
                System.out.println(a[i]+" Number is in Array at index "+i);
            } 
        }
    }
}
