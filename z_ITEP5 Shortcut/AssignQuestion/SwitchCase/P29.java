
// Write a program to input choice from user. 
//If user enter ‘+’ as choice then calculate addition of 2 number.
// If Choice ‘>’ then check which number is greaterst.
// If choice is ‘==’ then check both number is equal or not.
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;
import javax.swing.text.html.parser.Element;

public class P29 {
    public static void main(String ar[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choise ( + , > , == ):");
        char ch = sc.next().charAt(0);
        System.out.print("Enter number1: ");
        float num1 = sc.nextFloat();
        System.out.print("Enter number2: ");
        float num2 = sc.nextFloat();

        switch (ch) {
            case '+':
                System.out.println("Addition: " + (num1 + num2));
                break;
            case '>':
                if (num1 > num2) {
                    System.out.println("greater num: " + num1);
                } else {
                    System.out.println("greater num: " + num2);
                }
                break;
            case '=':
                if (num1 == num2) {
                    System.out.println("Both are equal");
                } else {
                    System.out.println("both are not equal");
                }
                break;
            default:
                System.out.println("Invalid input");
        }

    }
}
