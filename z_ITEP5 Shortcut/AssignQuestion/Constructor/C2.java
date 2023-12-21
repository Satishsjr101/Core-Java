// 
public class C2 {

    C2() {
        this(10);
        System.out.println("No argument constructor");
    }

    C2(int i) {
        this(10, 20);
        System.out.println("constructor with single argument");
    }

    C2(int a, int b) {
        System.out.println(a);
        System.out.println(b);
    }

    C2(int i, int j, int k) {
        this(30, 60);
    }

    public static void main(String[] args) {
        C2 c = new C2();
    }
}
