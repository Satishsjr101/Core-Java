import java.util.Scanner;

public class AllowedIfMedicalCause {
    public static void main(String argsa[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of classes held:");
        int held = sc.nextInt();
        System.out.print("Number of classes attended:");
        int attended = sc.nextInt();
        System.out.print("Do you have Medical cause:(y/n): ");
        char medi = sc.next().charAt(0);

        float per = ((attended * 100) / held);
        System.out.println("total attended class: " + per);

        if (per >= 75) {
            System.out.println("You will Allowed in Exam..");
        } else if (medi == 'y') {
            System.out.println("You will Allowed in Exam..");
        } else {
            System.out.println("You will not Allowed in Exam..");
        }
    }
}
