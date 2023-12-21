
// 27) *	#	*	#	*	#	*	#	*	…….
import java.util.Scanner;

public class P27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a nth terns: ");
        int n = sc.nextInt();
        for (int i = 0; i <= n; i++) {
            System.out.print("*  #  ");
        }
    }
}
