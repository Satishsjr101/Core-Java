
// Q.3 Write a program to reverse the array.
import java.util.ArrayList;
import java.util.Scanner;

class P {
    public void getArrListEle(ArrayList arr, int n) {
        Scanner sc = new Scanner(System.in);
        // int n = arr.size();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter " + (i + 1) + " element");
            arr.add(sc.nextInt());
        }
    }

    public void findMaxMinEle(ArrayList arr, int n) {
        Integer maxArr = -2147483647;
        Integer minArr = 2147483647;

        for (int i = 0; i < n; i++) {
            if (minArr > (Integer) arr.get(i)) {
                minArr = (Integer) arr.get(i);
            }
            if (maxArr < (Integer) arr.get(i)) {
                maxArr = (Integer) arr.get(i);
            }
        }
        System.out.println("MIN ELE : " + minArr);
        System.out.println("MAX ELE : " + maxArr);
    }

    public void reverseArrL(ArrayList arr, int n) {
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(arr.get(i) + " ");
        }
    }
}

public class ReverseArrL extends P {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ArrayList Size : ");
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>(n);

        P obj = new P();
        obj.getArrListEle(arr, n);
        System.out.println(arr);

        ArrayList<Integer> revArr = new ArrayList<>(n);
        for (int i = n - 1; i >= 0; i--) {
            revArr.add(arr.get(i));
        }
        System.out.println(revArr);
    }
}
