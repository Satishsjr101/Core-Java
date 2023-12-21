public class SpecificPos {
    public static void main(String[] args) {
        int[] arr = new int[10];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
          arr[3] = 4;
        int index = 7;
        for (int i = arr.length-1; i >index; i--) {
            arr[i] = arr[i-1];
            
        }
System.out.println("=======================");
        // System.out.println(arr[0]);
        arr[index] = 5;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
