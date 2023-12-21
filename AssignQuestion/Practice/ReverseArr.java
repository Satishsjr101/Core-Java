import java.util.Scanner;

public class ReverseArr {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=1;
        int arr[]=new int[6];

       for(int i=0;i<arr.length;i++){
        System.out.print("Enter "+(i+1)+" element of Arr: ");
        arr[i]=sc.nextInt();
       }

       for(int i=arr.length-1;i>=0;i--){
        System.out.print(arr[i]+ " ");
        
       }
    }
}

