import java.util.*;

public class LeapYear {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year:");
        int year = sc.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                System.out.println("not leap year");
            } else {
                System.out.println("Leap year");
            }
        } else {
            System.out.println("not leap year");

        }
    }
}