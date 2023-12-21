public class S1 {
    int a = 5;
    static int b = 10;

    public static void main(String[] args) {
        S1 s1 = new S1();
        System.out.println("A: " + s1.a);
        System.out.println("B: " + s1.b);

        s1.a = 30;
        s1.b = 20;

        System.out.println("B: s1 " + s1.b);
        System.out.println("A: s1 " + s1.a);

        S1 s2 = new S1();
        System.out.println("A: S2  " + s2.a);
        System.out.println("B: s2 " + s2.b);
    }
}