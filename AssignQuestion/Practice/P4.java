import java.util.Scanner;

public class P4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter charcter: ");
        char ch = sc.next().charAt(0);
        new P4().chechAlphates(ch);
        sc.close();
    }

    public void chechAlphates(int ch) {
        if ((ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                || (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'))
            System.out.println("given character is Vowel");
        else if (ch >= 'A' && ch <= 'z')
            System.out.println("given character is Consonant");
        else
            System.out.println("Invalid Input,Try Again!!!");

    }

}
