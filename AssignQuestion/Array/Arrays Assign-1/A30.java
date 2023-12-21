/*  30. Suppose A, B, C are arrays of integers of size M, N, and M + N respectively. 
	The numbers in array A appear in ascending order while the numbers in array B appear in descending order. 
	Write a java progtam to produce third array C by merging arrays A and B in ascending order. . 
 */
public class A30 {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5 };
        int[] b = { 10, 9, 8, 7, 6 };
        int[] c = new int[a.length + b.length];

        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            c[a.length + i] = b[i];
        }

        for (int i = 0; i < c.length; i++) {
            for (int j = i + 1; j < c.length; j++) {
                if (c[i] > c[j]) {
                    c[i] = c[i] + c[j];
                    c[j] = c[i] - c[j];
                    c[i] = c[i] - c[j];
                }
            }
            System.out.print(c[i] + " ");
        }
    }
}
