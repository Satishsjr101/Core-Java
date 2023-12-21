import java.util.InputMismatchException;
import java.util.Scanner;

class E2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try {
            System.out.println("Enter 1st Value: ");
            int a = s.nextInt();
            System.out.println("Enter 2nd Value: ");
            int b = s.nextInt();

            int c = a / b;
            System.out.println("Result : " + c);
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println("Denominator not be Zero");
        } catch (InputMismatchException e) {
            System.out.println("Input must be Interger");
            e.printStackTrace();
        }
        System.out.println("End------------------");
        s.close();
    }
}