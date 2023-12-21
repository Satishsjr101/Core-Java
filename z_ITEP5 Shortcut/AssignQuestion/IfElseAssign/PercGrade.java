import java.util.Scanner;

public class PercGrade {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter percentage: ");
        float per = sc.nextFloat();

        if (per >= 90) {
            System.out.println("A Grade");
        } else if (per >= 80 & per <= 90) {
            System.out.println("B Grade");
        } else if (per >= 60 & per <= 80) {
            System.out.println("C Grade");
        } else if (per > 60) {
            System.out.println("D Grade");
        }
    }
}
