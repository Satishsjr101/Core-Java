import java.util.*;

public class LeapYear {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year:");
        int year = sc.nextInt();
        switch (year % 100) {
            case 0:
                if (year % 400 == 0 && year % 4 == 0)
                    System.out.println("Leap year");
                else
                    System.out.println("Not a Leap year");
                break;
            default:
                System.out.println("not leap year");
        }
    }
}