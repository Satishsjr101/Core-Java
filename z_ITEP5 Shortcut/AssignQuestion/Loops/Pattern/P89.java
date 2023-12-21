/*_____
     1               
    101            
   10101         
  1010101           
 101010101  
10101010101
___________________ */
public class P89 {
    public static void main(String[] args) {
        int n = 12;
        for (int i = 1; i <= n; i++) {
            for (int sp = n - i; sp >= 1; sp--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j % 2 != 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}
