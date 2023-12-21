import java.util.*;

public class LeapYearN {
    public static void main(String ar[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Year:");
        int year = sc.nextInt();

        // year = (year / 400) % 400;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                System.out.println(year + " is a not Leap Year ");
            } else {
                System.out.println(year + " is a Leap Year ");
            }
        } else {
            System.out.println(year + " is a not Leap Year ");
        }
    }
}
