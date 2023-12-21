
import java.util.*;

public class CashWithdrwer {
    public static void main(String ar[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int Cash = sc.nextInt();
        int Note100 = Cash / 100;
        Cash = Cash % 100;
        System.out.println(Cash);
        int Note50 = (Cash / 50);
        Cash = Cash % 50;
        int Note10 = (Cash / 10);
        // Cash = Cash % 10;
        System.out.println("Num of Notes of 100:" + Note100 + "Notes");
        System.out.println("Num of Notes of 50:" + Note50 + "Notes");
        System.out.println("Num of Notes of 10:" + Note10 + "Notes");
    }
}
