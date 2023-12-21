public class Peak {
    public static void main(String[] args) {
       int a[] = { 1, 2, 5, 4, 7, 89, 0, 10 };
        // if (a[0] >= a[1]) {
        //     System.out.println(a[0] + " is peak");
        // } else if (a[a.length - 1] > a[a.length - 2]) {
        //     System.out.println(a[a.length - 1] + " is peak");
        // }
        for (int i = 1; i < a.length - 1; i++) {
            if (a[i] > a[i + 1] && a[i] > a[i - 1]) {
                System.out.println(a[i] + " is peak");
            }
        }
    }
}
