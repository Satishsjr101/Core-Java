import java.util.Scanner;

//W.A.P to check the sign of given number. 
public class P17 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = sc.nextInt();
        if (num < 0) {
            System.out.println("-ve sign.");
        } else {
            System.out.println("+ve sign.");
        }
    }
}
