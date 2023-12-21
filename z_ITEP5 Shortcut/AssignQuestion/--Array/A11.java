/*Q.11 There are two arrays object one containing 100 elements and another 
containing 50 elements. Both are of same data type. Can we assign one Array to 
another Arra */
public class A11 {
    public static void main(String[] args) {
        int a1[] = new int[100];
        int a2[] = new int[50];
        System.out.println(a1.length);
        a1 = a2;
        System.out.println(a1.length);
    }
}
