import java.util.Scanner;

public class P5 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n = sc.nextInt();
        for(int i=1;i<=n*2;i=i+2){
            System.out.println(i);
    }
}
}