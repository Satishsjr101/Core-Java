//  Q.17 Write a Java program to find duplicate values in an array of string values
public class A17 {
    public static void main(String[] args) {
        int a[] = { 8, 2, 6, 4, 4 };
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    System.out.println("Duplicate value: " + a[j]);
                }
            }
        }
    }
}
