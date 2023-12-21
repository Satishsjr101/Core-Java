import java.util.Scanner;

public class DaysWeekMonth {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter days: ");
        float days = sc.nextInt();

        float months = (days / 30);
        float weeks = (days % 365) / 7;
        days = (days % 365) % 7;
        System.out.println("---------Months/Weeks/Days Calculator------");
        System.out.println("Month/s = " + months);
        System.out.println("Week/s = " + weeks);
        System.out.println("Day/s  = " + days);
    }
}
