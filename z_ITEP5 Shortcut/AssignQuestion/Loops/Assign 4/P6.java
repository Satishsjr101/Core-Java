import java.util.Scanner;

public class P6 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n = sc.nextInt();
    //    
    int i=1;
    while (n!=0) {
        System.out.println(i*2);
        i++;
        n--;
    }
}
}