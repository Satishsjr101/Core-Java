public class FinRotationArr {
    public static void main(String[] args) {
        int  arr[] = {1,5,4,3,2,1};
        int minim = arr[0];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (minim>arr[i]) {
                minim = arr[i];
                System.out.println(minim+"m      ");
                count = i;
                
            }
        }
        System.out.println(count+" cc");
    }
}
