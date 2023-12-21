import java.util.Scanner;

public class perCalc {
    public static void main(String ar[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Marks Of Sub1:");
        float sub1 = sc.nextInt();
        System.out.println("Enter Marks Of Sub1:");
        float sub2 = sc.nextInt();
        System.out.println("Enter Marks Of Sub1:");
        float sub3 = sc.nextInt();
        System.out.println("Enter Marks Of Sub1:");
        float sub4 = sc.nextInt();
        System.out.println("Enter Marks Of Sub1:");
        float sub5 = sc.nextInt();

        float per = ((sub1 + sub2 + sub3 + sub4 + sub5) / 5.0f);

        System.out.println("-------------Result-----------:- ");
        System.out.println("percentage :" + per);

        if (per >= 60f) {
            System.out.println("You are passed with 1st Division");
        } else if ((per >= 50f) & (per <= 59f)) {
            System.out.println("You are passed with 2nd Division");
        } else if ((per >= 33f) & (per <= 49f)) {
            System.out.println("You are passed with 3rd Division");
        } else {
            System.out.println("Failed..");
        }
    }
}
