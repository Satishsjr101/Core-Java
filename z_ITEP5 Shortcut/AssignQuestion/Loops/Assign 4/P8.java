import java.util.Scanner;

public class P8 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int a = 0,b = 1;
        System.out.println("Enter a Number");
        int n = sc.nextInt();
        System.out.println(a);
        System.out.println(b);
        for(int i=1;i<=n-2;i++){
            int temp = a+b;
            System.out.println(temp);
            a = b;
            b = temp;
    }
}
}