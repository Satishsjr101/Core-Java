import java.util.*;
public class ReverseNo {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = sc.nextInt();
        int last_no=0;
        int remove_dgt=0;
        while(num>0){
            last_no = num%10;
            System.out.print(last_no);
            num = num/10;
        }
        System.out.println();
    }  
    
}
