import java.util.Scanner;

public class AllowedinExamOrNot {
    public static void main(String argsa[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of classes held:");
        int held = sc.nextInt();
        System.out.println("Number of classes attended:");
        int attended = sc.nextInt();

        float per = ((attended * 100) / held);
        System.out.println("total attended class: " + per);

        if (per >= 75) {
            System.out.println("You will Allowed in Exam..");
        } else {
            System.out.println("You will not Allowed in Exam..");
        }
    }
}
