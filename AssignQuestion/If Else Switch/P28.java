
/* Write a C program to input electricity unit charges and 
calculate total electricity bill according to the given condition:
 For first 50 units Rs. 0.50/unit For next 100 units Rs. 0.75/unit ,
 For next 100 units Rs. 1.20/unit For unit above 250 Rs. 1.50/unit ,
 An additional surcharge of 20% is added to the bill. 
 */
import java.util.Scanner;

public class P28 {
    public static void main(String ar[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter electricity unit charges : ");
        float units = sc.nextFloat();
        float ebill = 0, surcharge = 0;

        if (units <= 50) {
            ebill = units * (0.50f);
        } else if (units <= 150) {
            ebill = units * (0.75f);
        } else if (units <= 250) {
            ebill = units * (1.20f);
        } else if (units > 250) {
            ebill = units * (1.50f);
        }
        System.out.println("ebil " + ebill);
        surcharge = ebill + (ebill * (0.20f));
        System.out.println("total Bill with Tax: " + surcharge);

    }
}
