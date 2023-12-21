import java.util.*;

public class New_{
    public static void half_pyramid(int n){
        for(int i=1; i<=n;i++){
            for(int j=1;j<=n-i+1; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }

    public static void floyd_triangle(int n){
        int count=1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(count+" ");
                count ++;
            }System.out.println();
        }
    }

    public static void inverted_half_pyramid(int n){
    for(int i=1; i<=n;i++){
        for(int j=1;j<=n-i ; j++){
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }
}

public static void Zero_1_traingle(int n){
    for(int i=1; i<=n; i++){
        for(int j=1;j<=i; j++){
            if((i+j)%2==0){  //even
                System.out.print("1 ");
            }
            else{    // odd
                System.out.print("0 ");
            }
        }
        System.out.println();
    }

}
    public static void main(String args[]){
        Zero_1_traingle(1098);
        // floyd_triangle(10);
       // inverted_half_pyramid(6);
        // half_pyramid(5);
        // String larger=(5>3)?"Even":"Odd";
        // System.out.println(larger);
        
        // Scanner sc=new Scanner(System.in);
        // System.out.println("Enter a number:");
        // int num=sc.nextInt();
        // if(num>0){
        //     System.out.println("Postive number"); 
        // }
        // else if(num<0){
        //     System.out.println("Nagative number");
        // }
        // else{
        //     System.out.println("Invalid number");
        // }
        // int sum=0;
        // int count=1;
        // while(count<=num){
        //     sum=sum+count;
        //     count++;
        // }
        // System.out.println("Sum of number id "+sum);
    }
}