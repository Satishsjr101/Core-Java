import java.util.Scanner;

public class P11 {
    public static void main(String[] args) {
        int a[] = new int[10];
        int b[] = new int[50];
        System.out.println(a.length + " previous");
        a = b;
        System.out.println(a.length + " after assign");
    }
}
