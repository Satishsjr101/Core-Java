/*______

___________
|\       / |
|  \   /   |
|    /\    |
|  /    \  |
|/________\|

__________ */
public class P83 {

    public static void main(String[] args) {
        int n = 7;

        for (int i = 0; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j == i || j == (n + 1) - i) {
                    if (j == i) {
                        System.out.print("\\");
                    } else {
                        System.out.print("/");
                    }
                } else if (i == 0 || i == 7) {
                    System.out.print("_");
                } else if (j == 1 || j == 7) {
                    System.out.print("|");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
