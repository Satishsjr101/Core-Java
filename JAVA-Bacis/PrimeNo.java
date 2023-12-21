import java.util.*;
public class PrimeNo {
    public static void isPrimeNo(int n){
      
        if(n==2){
            System.out.println(n+" is prime number");
        }
        else{
            boolean isPrime = true;
            for(int i=2; i<=n*n;i++){
                if(n%i == 0){
                    isPrime = false;
                }
            }
            if(isPrime = true){
                System.out.println(n+ " is prime number");
            }
            else{
                System.out.println(" n is not a prime number");
            }
        }

      
    
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = sc.nextInt();
        isPrimeNo(n);
    }
}
