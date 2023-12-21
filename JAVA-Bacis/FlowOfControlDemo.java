import java.util.Scanner;
import java.lang.*;

public class FlowOfControlDemo {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Choose the above  option :");
        System.out.println("1.Fahrenet(F/f)");
        System.out.println("2. Celcius(C/c)");
        char degree ;
        degree = sc.next().charAt(0);
        float f,c;
        if(degree == 'F' || degree == 'f' ){
            System.out.println("Enter degree in Fahreneit:");
            f = sc.nextFloat();
            c = (f-32) * (float)5/9 ;
            System.out.println("Celsius : "+c);
        }else{
            System.out.println("Enter degree in celcius:");
            c = sc.nextFloat();
            f = (9/5)*c + (float)32 ;
            System.out.println("Fahreneit : "+f);
        }
    }
}