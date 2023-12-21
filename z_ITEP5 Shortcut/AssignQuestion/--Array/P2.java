import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp = 0;
        int i;
        String[] s = new String[5];
        for ( i = 0; i < s.length; i++) {
            System.out.println("Enter a G2 Name");
            s[i] = sc.next();
        }
        for ( i = 0; i < s.length; i++) {
            System.out.println("I : " + i + " Element :" + s[i]);
        }
        System.out.println("Enter a Searching Name");
        String name = sc.next();
        for ( i = 0; i < s.length; i++) {
            if (name.equals(s[i])) {
                System.out.println("Number is " + i + " position is :" + name);
                temp = 1;
                break;
            }
        }
        if (temp == 1) {
            System.out.println("Name present in array in " + (i+1) + " position");
        } else {
            System.out.println("Name not found");
        }
    }
}