import java.util.Scanner;

public class P10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[20];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

       for (int i = 0; i < a.length; i++) {
            if(a[i]>0){
                System.out.println(a[i]+"is a positve integer");
            }
            if(a[i]<0){
                System.out.println(a[i]+" is a negative number");
            }
            if(a[i]%2==0){
                System.out.println(a[i]+" is even ");
            }
            if(a[i]%2==1){
                System.out.println(a[i]+" is odd ");
            }
        }
    }
}