/*
 * 32. Given two arrays of integers A and B of sizes M and N respectively. 
 * Write a Write a c program, which will produce a third array named C. such that the following sequence is followed. 
All even numbers of A from left to right are copied into C from left to right. 
All odd numbers of A from left to right are copied into C from right to left. 
All even numbers of B from left to right are copied into C from left to right. 
All old numbers of B from left to right are copied into C from right to left.
    e.g., A is {3, 2, 1, 7, 6, 3} and B is {9, 3, 5, 6, 2, 8, 10} 
    the resultant array C is {2, 6, 6, 2, 8, 10, 5, 3, 9, 3, 7, 1, 3} 
 */
public class A32 {
    // ******************** Wrong solution
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int b[] = { 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
        int c[] = new int[a.length + b.length];
        int even = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                even = a[i];
            }
            c[i] = even;
            System.out.print(c[i] + " ");
        }

    }
}
