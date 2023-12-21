public class Swap {
    public static void main(String ar[]) {
        int x = 50;
        int y = 30;
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("X:" + x);
        System.out.println("Y:" + y);
    }
}
