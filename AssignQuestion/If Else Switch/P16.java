
/*W.A.P to convert temperature from Fahrenheit to Celsius and Celsius to Fahrenheit.
For given problem you have to take choice from user. 
If user enter choice ‘c’ or ‘C’ then convert Fahrenheit to Celsius. 
If user enter choice ‘f’ or ‘F’ then convert Celsius to Fahrenheit */
import java.util.Scanner;

public class P16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Choise (c/f): ");
        char ch = sc.next().charAt(0);
        float c, f;

        if (ch == 'c' || ch == 'C') {
            System.out.println("Enter celcius: ");
            c = sc.nextFloat();
            f = ((c - 32) * 5) / 9;
            System.out.println("Temperature in Frhrenheit is: " + f);
        } else if (ch == 'f' || ch == 'F') {
            System.out.println("Enter Frehnheit: ");
            f = sc.nextFloat();
            c = ((f - 32) * 5) / 9;
            System.out.println("Temperature in celsius is: " + c);
        }

    }
}
