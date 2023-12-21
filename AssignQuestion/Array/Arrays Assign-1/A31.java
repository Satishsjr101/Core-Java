/* 
31. Suppose X. Y, Z are arrays of integers of size M, N, and M + N respectively. 
The numbers in array X and Y appear in descending order. 
Write a java program to produce third array Z by merging arrays X and Y in descending order.  */
public class A31 {
    public static void main(String[] args) {
        int[] x = { 5, 4, 3, 2, 1 };
        int[] y = { 10, 9, 8, 7, 6 };
        int[] z = new int[x.length + y.length];

        for (int i = 0; i < x.length; i++) {
            z[i] = x[i];
        }
        for (int i = 0; i < y.length; i++) {
            z[x.length + i] = y[i];
        }
        for (int i = 0; i < z.length; i++) {
            for (int j = i + 1; j < z.length; j++) {
                if (z[i] < z[j]) {
                    z[i] = z[i] + z[j];
                    z[j] = z[i] - z[j];
                    z[i] = z[i] - z[j];
                }
            }
            System.out.print(z[i] + " ");
        }
    }
}
