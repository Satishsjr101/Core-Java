import java.util.Scanner;
class Inheritance{
    public static void main(String args[]){
        SimpleInt s1 = new SimpleInt();
        s1.get();
        s1.oper();
        s1.show();
        // EMI e1 = new EMI();
        // e1.get();
        // e1.calEmi();
        // e1.show();
        // e1.showEmi();
    }
}
class SimpleInt
{
    int p, t;
    float r,si;
    void get()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Amount:");
        p = sc.nextInt();
        
        System.out.println("Enter Rate:");
        r = sc.nextFloat();
       
        System.out.println("Enter Time:");
        t = sc.nextInt();
    }
    void oper()
    {
        si = (p*r*t)/100;
    }
    void show()
    {
        System.out.println("Simple Interst:"+si);
    }
}

// class EMI extents SimpleInt
// {
//     float A,emi;
//     int mn;
//     void calEmi()
//     {
//         A = p + si;
//         mn = t * 12;
//         emi = A/mn;
//     }
//     void showEmi()
//     {
//         System.out.println("Total EMI :"+emi);
//     }
// }