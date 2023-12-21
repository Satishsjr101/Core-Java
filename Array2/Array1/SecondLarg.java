public class SecondLarg {
    public static void main(String[] args) {
        int[] arr = {40, 10, 30};
        int i;
        int largest = arr[0];
        int secondLargest = 0;
        int count = 0;
        for ( i = 0; i < arr.length; i++) {
            if (arr[i]>largest) {
                secondLargest = largest;
                largest = arr[i];
            }
            else if(arr[i] > secondLargest && arr[i] != largest){
                secondLargest = arr[i];
            }
            if(arr[i]==largest){
                
            }
           
        }
      if (count==1) {
        System.out.println("nnn");
      } else {
        System.out.println(secondLargest);
      }
    }
}
