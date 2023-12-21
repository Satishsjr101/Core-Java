/*______
x
xx
xxx
xxxx
xxx
xx
x
___________*/
public class P76 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("X");
            }
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print("X");
            }
            System.out.println();
        }
    }
}
