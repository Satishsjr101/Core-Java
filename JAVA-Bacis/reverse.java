import java.util.*;
public class reverse {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = sc.nextInt();
        int last_no=0;
        int rev=0;
        while(num>0){
            last_no = num%10;
            rev=(rev*10)+last_no;
            num = num/10;
        }
        System.out.println(rev);
        int n=12345;
        int rev_no=0;
        while(n>0){
            int l_no=n%10;
            rev_no=(rev_no*10)+l_no;
            n=n/10;
        }
        System.out.println(rev_no);
    
}
}