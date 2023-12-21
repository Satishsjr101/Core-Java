import java.util.Scanner;

public class P10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int sum = 0;
        System.out.println("Enter a Number");
        int n = sc.nextInt();
        
        for(int i=1;i<=n;i++){
            sum = sum + (2*i);
        }
        System.out.println("sum "+sum);
           
    }
}
