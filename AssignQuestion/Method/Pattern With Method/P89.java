/*_____
     1               
    101            
   10101         
  1010101           
 101010101  
10101010101
___________________ */

import java.util.Scanner;

public class P89 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        new P89().printPattern(n);
        sc.close();
    }

    public void printPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < 2 * n; j++) {
                if ((j > n + 1 - i) && (j < n - 1 + i))
                    if ((i + j) % 2 == 0)
                        System.out.print("0");
                    else
                        System.out.print("1");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
