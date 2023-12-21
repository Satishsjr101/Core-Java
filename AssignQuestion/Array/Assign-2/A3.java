// Write a program for Swapping Two Arrays .
public class A3 {
    public static void main(String[] args) {
        int a1[] = { 1, 2, 3, 4 };
        int a2[] = { 30, 50, 70, 90 };

        for (int i = 0; i < a1.length; i++) {
            int temp = a1[i];  
            a1[i] = a2[i];
            a2[i] = temp;
            System.out.print(a1[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < a2.length; i++) {
            System.out.print(a2[i] + " ");
        }
    }
}
