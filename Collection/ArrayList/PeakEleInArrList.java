import java.util.ArrayList;
import java.util.Scanner;

class PeakEleInArrL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ArrayList Size");
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>(n);

        for (int i = 0; i < n; i++) {
            System.out.println("Enter " + (i + 1) + " element");
            arr.add(sc.nextInt());
        }

        for (int i = 0; i < arr.size(); i++) {
            if (i == 0) {
                if (arr.get(i) > arr.get(i + 1)) {
                    System.out.println(arr.get(i));
                }
            } else if (i == arr.size() - 1) {
                if (arr.get(i) > arr.get(i - 1)) {
                    System.out.println(arr.get(i) + " ");
                }
            } else {
                if (arr.get(i) > arr.get(i + 1) && arr.get(i) > arr.get(i - 1)) {
                    System.out.print(arr.get(i) + " ");
                }
            }
        }
    }
}
