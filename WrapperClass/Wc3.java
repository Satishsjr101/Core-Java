import java.util.Scanner;

public class Wc3 {
    public static void main(String[] args) {
        Wc3.m1();
    }

    public static boolean m1(){
                Scanner sc = new Scanner(System.in);
        String hariom = "    NON VILENCE PERSON    ";

        hariom = hariom.trim();
        int i;
        for (i = 0; i < hariom.length(); i++) {
            char ch = sc.next().charAt(i);
            if (!((Character.isAlphabetic(i)) || (Character.isSpaceChar(i)))) {
                break;
            }
        }
        if(i==hariom.length()
            return true;
        return false;
    }
}
