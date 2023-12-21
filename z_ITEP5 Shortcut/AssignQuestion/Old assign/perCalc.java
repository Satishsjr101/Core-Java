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
        System.out.println("percentage :" + per);

        String a = (per >= 60f) ? "You are passed with 1st Division"
                : ((per >= 50f) & (per <= 59f)) ? "You are passed with 2nd Division"
                        : ((per >= 33f) & (per <= 49f)) ? "You are passed with 3rd Division" : "You are failed.";
        System.out.println("Result :- " + a);

    }

}
