public class Swap {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int[] arr1 = {4,5,6};
        int temp = 0;
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("arr  "+arr[i]+" ===== arr1 "+arr1[i]);
        }
        for (int i = 0; i <3; i++) {
           temp = arr1[i];
           arr1[i] = arr[i];
           arr[i] = temp;
        }
        System.out.println();
        System.out.println("===== Swap =====\n");
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("arr  "+arr[i]+" ===== arr1  "+arr1[i]);
        }
    }
}
