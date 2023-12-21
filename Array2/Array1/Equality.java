public class Equality{
    public static void main(String[] args) {
        int[] arr = {8,7,6,5,4,3};
        int[] arr1 = {8,7,6,5,4,3};
        boolean status = true;
        if (arr.length == arr1.length) {
            for (int i = 0; i < arr1.length; i++) {
                if (arr != arr1) {
                  status = false;
                }

                
            }
        } else {
            
        }
    }
}