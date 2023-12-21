import java.util.ArrayList;

class Add {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 1000; i++) {
            list.add(i);
        }
        System.out.println(list);
    }
}