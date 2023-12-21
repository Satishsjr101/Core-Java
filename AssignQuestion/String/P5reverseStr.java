public class P5reverseStr {
    public static void main(String[] args) {
        String str[] = { "Java Is Plateform Independent" };

        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
            str[i].split(str[i]);
        }
    }
}
