//  Q.6 Sort the array of 0s , 1s and 2s.

import java.util.ArrayList;
import java.util.Scanner;

class P1 {
    public void sort012(ArrayList<Integer> al) {
        swap(al);
    }

    public void swap(ArrayList al) {
        for (int i = 0; i < al.size(); i++) {
            for (int j = i + 1; j < al.size(); j++) {
                if ((int) al.get(i) > (int) al.get(j)) {
                    int temp = (int) al.get(i);
                    al.set(i, al.get(j));
                    al.set(j, temp);
                }
            }
        }
    }

}

public class SortArrL0s1s2s {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arrList = new ArrayList<>();

        arrList.add(0);
        arrList.add(1);
        arrList.add(2);
        arrList.add(0);
        arrList.add(1);
        arrList.add(2);
        arrList.add(1);
        arrList.add(0);
        arrList.add(1);
        arrList.add(2);
        arrList.add(0);
        arrList.add(0);
        System.out.println(arrList);
        new P1().sort012(arrList);
        System.out.println(arrList);
    }
}
