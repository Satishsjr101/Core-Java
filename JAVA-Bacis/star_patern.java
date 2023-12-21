import java.util.*;

public class star_patern {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  a number:");
        int n = sc.nextInt();
        
        for(int i=1;i<=n;i++){
            
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(i);j++){
                if((j%2==0)){
                    System.out.print("*  ");
                }             
               
            }
            System.out.println();
        }
        // for(int i=1;i<=n;i++){
            
        //     for(int j=1;j<=n-i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=i;j++){
        //         System.out.print(" * ");
        //     }
        //     System.out.println();
        // }

}
}

