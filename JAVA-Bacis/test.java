import java.util.*;

public class test {
    public static void main(String args[]) {
        // int larger=(5>3)?"Even":"Odd";
        // System.out.println(larger);

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a character:");
        // char c = sc.next().charAt(0);
        // System.out.println(c);

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a three DigitsNumber:");
        // int x = sc.nextInt();
        // int l_dgt=x%10;
        // int b=x/10;
        // int m_dgt=b%10;
        // int f_dgt=b/10;

        // int sum;
        // sum = l_dgt+m_dgt+f_dgt;
        // System.out.println(l_dgt);
        // System.out.println(m_dgt);
        // System.out.println(f_dgt);

        // System.out.println("Sum of Three digit:"+sum);

        // System.out.println("Enter a number2:");
        // int y = sc.nextInt();
        // System.out.println("Enter a number3:");
        // int z = sc.nextInt();

        // int temp=n ;
        // n=m;
        // m=temp;
        // System.out.println();
        // System.out.println(n);
        // System.out.println(m);
        // int n=149;
        // for(int i=n;i>=1;i--){

        // System.out.print(i+" ");
        // }

        // int x=8;
        // int y=6;
        // x=x+y;//8+6=14
        // y=x-y;//14-6=8
        // x=x-y;

        // System.out.println("X:"+x);
        // System.out.println("Y:"+y);

        // x = 10;
        // y = 20;
        // x = x + y;// x=10+20=30
        // y = x - y;// y=30-20=10
        // x = x - y;// x=30-10=20
        // System.out.println("X:" + x);
        // System.out.println("Y:" + y);

        // int n=-4;
        // if(n<0){
        // System.out.println(n);

        // }else{
        // System.out.println();

        // }
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a status of Driver :");
        // System.out.println("Married status(y/n):");
        // char status=sc.next().charAt(0);
        // System.out.println("Male/Female(m/f):");
        // char sex=sc.next().charAt(0);
        // System.out.println("Age:");
        // int age=sc.nextInt();
        // Check_eligible_for_driver(status, sex, age);

        // System.out.println("Enter Salary:");
        // float salary=sc.nextInt();
        // gross_salary(salary);
        // System.out.println("Enter four digit num:");
        // int n=sc.nextInt();
        // four_Dgtno_into_single_dgtno(n);
        // reverse_a_no(n);
        // System.out.println("Enter price:");
        // int price=sc.nextInt();
        // if( price>=1000){
        // int discount=(price*20)/100;
        // price=price+discount;

        // System.out.println(price);
        // }
        // else{
        // System.out.println(price);
        // }
        // System.out.println("Enter angle1 of triangle:=");
        // int a1=sc.nextInt();
        // System.out.println("Enter angle2 of triangle:=");
        // int a2=sc.nextInt();
        // System.out.println("Enter angle3 of triangle:=");
        // int a3=sc.nextInt();
        // check_isTraingle2(a1, a2, a3);

        // System.out.println("Enter a character:");
        // char ch=sc.next().charAt(0);
        // if(Character.isLowerCase(ch)){
        // System.out.println("Lowercase");
        // }else{
        // System.out.println("Uppercase");
        // }
        // if(ch=='!' || ch=='@'|| ch=='#' || ch=='$'|| ch=='%' || ch=='^'|| ch=='&' ||
        // ch=='*'|| ch=='?'){
        // System.out.println("yes have a Special symbol");
        // }else{
        // System.out.println("not have a Special symbol");
        // }

        // System.out.println("Enter a number[0-6]:");
        // int num=sc.nextInt();
        // print_weekdays_name(num);
        // System.out.println("if you want to continue:(y/n)");
        // char ch=sc.next().charAt(0);
        // loop(ch);
        // System.out.println("Enter a number:");
        // int n=sc.nextInt();
        // int Sn=n*(n+1)/2;
        // System.out.println("Sum :"+Sn);
        // System.out.println("Enter a number:");
        // int n=sc.nextInt();
        // int temp=0;
        // int rev=0;
        // while(n != 0){
        // temp=n%10;
        // rev=temp+(rev*10);
        // n=n/10;
        // }

        // int num=0;
        // while(rev != 0){
        // int tem =rev%10;
        // num=(num*10)+tem;
        // print_digit_into_words(tem);
        // rev=rev/10;
        // }

        // System.out.println("Enter a number:");
        // int n=sc.nextInt();
        // int sum=0;
        // int fn=0;
        // int ln=1;
        // System.out.print(" " + fn);
        // System.out.print(" " + ln);
        // for(int i=1;i<=n;i++){
        // sum=fn+ln;
        // System.out.print(" " + sum);
        // fn=ln;
        // ln=sum;
        // }

        // if(n==2){
        // System.out.println("is a prime number");
        // break;
        // }
        // int i=2;
        // while(i<n){
        // if( n%i==0 ){
        // System.out.println("Not a prime number");
        // break;

        // }else{
        // System.out.println("is a prime number");
        // break;
        // }
        // i=i+1;
        // }

        // int fact=1;
        // for(int i=1;i<=n;i++){
        // fact=fact*i;
        // }
        // System.out.println(fact);

        // int i=2;
        // while(n !=0){
        // int pow=2*i;
        // i=i+1;
        // if(pow == n){
        // System.out.println("Yes");
        // break;
        // }
        // else{
        // System.out.println("No");--
        // break;
        // }
        // }
        // int marks =(int) 99.99f;
        // System.out.println(marks);

        int n1 = 5;
        char ch = 'a';

        for (int line = 1; line <= n1; line++) {

            for (int str = 1; str <= line; str++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
    }

    public static void loop(char ch) {
        if (ch == 'y' || ch == 'Y') {
            System.out.println("Enter a number[0-6]:");
            Scanner sc = new Scanner(System.in);

            int num = sc.nextInt();
            print_weekdays_name(num);
            while (ch == 'y') {
                loop(ch);
            }
        } else {
            System.out.println();
        }
    }

    public static void print_digit_into_words(int num) {
        switch (num) {
            case 0: {
                System.out.print("Zero ");
                break;
            }
            case 1: {
                System.out.print("one ");
                break;
            }
            case 2: {
                System.out.print("two ");
                break;
            }
            case 3: {
                System.out.print("three ");
                break;
            }
            case 4: {
                System.out.print("four ");
                break;

            }
            case 5: {
                System.out.print("five ");
                break;
            }
            case 6: {
                System.out.println("six ");
                break;
            }
            case 7: {
                System.out.print("seven ");
                break;
            }
            case 8: {
                System.out.print("eigth ");
                break;
            }
            case 9: {
                System.out.print("nine  ");
                break;
            }
            default: {

                System.out.print("Invalid number ");
                break;
            }
        }
    }

    public static void print_weekdays_name(int num) {
        switch (num) {
            case 1: {
                System.out.println("Sunday");
                break;
            }
            case 2: {
                System.out.println("Monday");
                break;
            }
            case 3: {
                System.out.println("tuesday");
                break;
            }
            case 4: {
                System.out.println("wednesday");
                break;
            }
            case 5: {
                System.out.println("thursday");
                break;
            }
            case 6: {
                System.out.println("Friday");
                break;
            }
            case 7: {
                System.out.println("Saturday");
                break;
            }
            default: {

                System.out.println("Invalid number");
                break;
            }
        }
    }

    public static void check_isTraingle2(int a1, int a2, int a3) {
        int largest = 0;
        int sum = 0;
        if (a1 > a2 && a1 > a3) {
            largest = a1;
        } else if (a2 > a1 && a2 > a3) {
            largest = a2;
        } else {
            largest = a3;
        }

        if (largest > a1 + a2 || largest > a2 + a3 || largest > a3 + a1) {
            System.out.println("Yes it is a traingle ");
        } else {
            System.out.println("not a traingle ");
        }

    }

    public static void check_isTraingle1(int a1, int a2, int a3) {
        int sum = 0;
        sum = a1 + a2 + a3;
        if (sum == 180) {
            System.out.println("Yes it is a traingle ");
        } else {
            System.out.println("not a traingle ");
        }

    }

    public static void reverse_a_no(int n) {
        int rev = 0;
        while (n > 0) {
            int lastno = n % 10;
            rev = (lastno * 10) + rev;
            n = n / 10;
        }
        System.out.println(rev);
    }

    public static Float discount_10per(Float price) {
        if (price >= 1000) {
            Float discount = (price * 20);
            return discount;
        } else {
            return price;
        }

    }

    public static void four_Dgtno_into_single_dgtno(int n) {
        int l_no = n % 10;
        int md2 = n / 10;
        md2 = md2 % 10;
        int md1 = n / 100;
        md1 = md1 % 10;
        int f_no = n / 1000;
        f_no = f_no % 10;

        int sum = l_no + md1 + md2 + f_no;
        System.out.print(l_no + 1);
        System.out.print(md2 + 1);
        System.out.print(md1 + 1);
        System.out.print(f_no + 1);
        System.out.println("by adding 1 in digit:" + (l_no + 1) + (md2 + 1) + (md1 + 1) + (f_no + 1));
        System.out.print("Sum of All digit:" + sum);
    }

    public static void gross_salary(Float salary) {
        double dearness_allow = salary * (0.40);
        double rent_allow = salary * (0.20);
        double total_salary = salary + dearness_allow + rent_allow;
        System.out.println("--------------------------------------------");
        System.out.println("Salary of Ramesh:" + salary + "Rs.");
        System.out.println("Dearness allowance 40% of Salary:" + dearness_allow + "Rs.");
        System.out.println("Rent allowance 20% of Salary:" + rent_allow + "Rs.");
        System.out.println("Gross Salary of Ramesh:" + total_salary + "Rs.");
        System.out.println("--------------------------------------------");

    }

    public static void Check_eligible_for_driver(char status, char sex, int age) {

        if (status == 'y' || status == 'Y') {
            System.out.println("Yes Insured for Driver");
        } else {
            if (status == 'n' || status == 'N') {
                if (sex == 'm' || sex == 'M') {
                    if (age >= 30) {
                        System.out.println("Yes Insured for Driver");
                    } else {
                        System.out.println("Not Insured for Driver");

                    }
                } else if (sex == 'f' || sex == 'F') {
                    if (age >= 25) {
                        System.out.println("Yes Insured for Driver");
                    } else {
                        System.out.println("Not Insured for Driver");

                    }

                } else {
                    System.out.println("Not Insured for Driver");

                }

            }

        }

    }
}
