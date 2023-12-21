import java.util.Scanner;

public class P17 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number ");
        int x = sc.nextInt();
          System.out.println("Enter a Number ");
        int y = sc.nextInt();
        int r = 1;
        for(int i=1;i<=y;i++){
            r = r*x;
        }
        System.out.println(r);

    }
}
