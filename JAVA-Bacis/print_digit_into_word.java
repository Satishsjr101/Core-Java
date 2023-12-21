import java.util.*;
public class print_digit_into_words{
    public static void main(String args[]){
         System.out.println("Enter a number:");
         Scanner sc = new Scanner(System.in);
         int n=sc.nextInt();
         int temp=0;
         int rev=0;
         while(n != 0){
            temp=n%10;
            rev=temp+(rev*10);
            n=n/10;
          }

         int num=0;
         while(rev != 0){
            int tem =rev%10;
            num=(num*10)+tem;
            print_digit_into_words(tem);
            rev=rev/10;
          }
        } 
  

    public static void print_digit_into_words(int num){
        switch(num){
        case 0:{
            System.out.print("Zero ");
            break;
        }
        case 1 :{
            System.out.print("one ");
            break;
        }
        case 2:{
            System.out.print("two ");
            break;
        }
        case 3:{
            System.out.print("three ");
            break;
        }
        case 4:{
            System.out.print("four ");
            break;

        }
        case 5:{
            System.out.print("five ");
            break;
        }
        case 6:{
            System.out.println("six ");
            break;
        }
        case 7:{
            System.out.print("seven ");
            break;
        }
        case 8:{
            System.out.print("eigth ");
            break;
        }
        case 9:{
            System.out.print("nine  ");
            break;
        }
        default :{
     
          System.out.print("Invalid number ");
          break;
        }
    }

    }
}