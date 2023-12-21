// Q.2 Find minimum and maximum element in array

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
}

public class MaxMinEle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ArrayList Size : ");
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>(n);

        P obj = new P();

        obj.getArrListEle(arr, n);

        obj.findMaxMinEle(arr, n);

    }
}
