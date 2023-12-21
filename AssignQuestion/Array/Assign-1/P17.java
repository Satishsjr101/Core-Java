import java.util.Scanner;

public class P17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a[] = new String[5];

        for (int i = 0; i < a.length; i++) {
            System.out.print("Emter name: ");
            a[i] = sc.nextLine();
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i].contentEquals(a[j])) {
                    System.out.println(a[i] + "  is a duplicate ");
                }
            }
        }
    }
}