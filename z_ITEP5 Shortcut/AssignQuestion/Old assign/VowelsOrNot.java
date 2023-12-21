import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class VowelsOrNot {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  String: ");

        char ch = sc.next().charAt(0);
        boolean v1 = (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
        boolean v2 = (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U');

        String max = (v1 || v2) ? "It is Vowels" : "It is not Vowels";

        System.out.println(max);

    }
}
