import java.util.Scanner;

public class P9 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int sum = 0;
        System.out.println("Enter a Number");
        int n = sc.nextInt();
        
        for(int i=1;i<=n;i++){
            sum = sum + i;
        }
        System.out.println("Sum "+sum);
           
             
       
    }
}
