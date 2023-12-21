public class P5 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,11,7,8,9};
        int count = 0;
        System.out.print("Even element ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2!=0) {
                System.out.print(" "+arr[i]);
                count++;
            }
        }
        System.out.println();
        System.out.println(count+" Even element found");
    }
}
