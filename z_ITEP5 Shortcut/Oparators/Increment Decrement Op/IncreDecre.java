public class IncreDecre {
    public static void main(String[] args) {
        int i = 11;

        i = i++ + ++i; // 11+13=24

        System.out.println(i);
    }
}