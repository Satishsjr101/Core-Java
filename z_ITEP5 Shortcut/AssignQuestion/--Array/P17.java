public class P17 {
    public static void main(String[] args) {
        String a[] = { "Umang1", "Umang3", "Umang5", "Umang4", "Umang1" };
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    System.out.println(a[i] + "  is a duplicate  at " + j);
                }
            }
        }
    }
}