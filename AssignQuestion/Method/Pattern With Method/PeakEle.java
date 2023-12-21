import java.util.Scanner;

class Peak1 {

    public int[] element(int[] a) {

        // int i=0;
        System.out.print("Peak Element = ");
        for (int i = 1; i < a.length - 1; i++) {
            if (a[i] > a[i + 1] && a[i] > a[i - 1])
                return a[i];
            // System.out.print(x[i]+" ");
        }
    }
}

class Peak1Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of an Array = ");
        int size = sc.nextInt();

        int[] a = new int[size + 2];
        for (int i = 1; i <= size; i++) {
            System.out.print("Enter " + i + " Element of an array = ");
            a[i] = sc.nextInt();
        }
        Peak1 obj = new Peak1();
        System.out.print(obj.element(a) + " ");
    }
}
