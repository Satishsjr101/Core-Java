package Cases;

import java.util.Scanner;

 class E11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter 2 Values: ");
            int a = sc.nextInt();
            int b = sc.nextInt();
        } catch (Exception e) {
            System.out.println("ERROR-----------");
        }finally{
            System.out.println("End of Code ");
        }
    }
}
