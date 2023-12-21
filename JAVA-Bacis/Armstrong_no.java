import java.util.*;

public class Armstrong_no{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  a three DigitsNumber:");
        int x = sc.nextInt();
        ArmstrongNum(x);
    
    }
    public static void ArmstrongNum(int x){
        int l_dgt=x%10;
        int b=x/10;
        int m_dgt=b%10;
        int f_dgt=b/10;     
        int sum = l_dgt*l_dgt*l_dgt + m_dgt*m_dgt*m_dgt + f_dgt*f_dgt*f_dgt;
        if(sum==x){
            System.out.println(" Armstrong number:");
        }

        
        else{
            System.out.println("Not an Armstrong number:");

        }
        
    }
}