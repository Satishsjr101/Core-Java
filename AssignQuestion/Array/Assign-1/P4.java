public class P4 {
    public static void main(String[] args) {
        
        int[] arr = {100,50,60,90,30};
        int min = arr[0];
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<min) {
               min = arr[i];
            }
            if (arr[i]>max) {
             max = arr[i];  
            }
        }
        System.out.println(max+ " max");
        System.out.println(min+" min");
    }
}
