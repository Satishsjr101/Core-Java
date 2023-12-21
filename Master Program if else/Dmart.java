/* 
A person enter in a D-Mart mall for the shopping. He is first
time visiting the D-mart mall. 
He/She has to purchase 10 items.

System should ask for the name of the customer and Gender.

User will tell you the item name and quantity of each product
purchased one by one.

You have to calculate the total bill amount on the following 
Criteria basis

 on first product purchase if quantitiy greater then
 4 then you have to offer 5% discount on total price of that product

 on 5th product purchase you have to offer 10% discount on total
 price.

 on 10th product purchase you have to offer 15% discount on total
 price of that product. 

 let suppose the cost of 1st product is 10
 cost of 2nd product is 20
    .
    .
 cost of 10th product is 100;

 if Total Bill amount is greater then 10000 then you have
 to offer 15% of total bill amount
 if total Bill amount is between 5000 and 10000 then 
 you have to offer 10% of total bill amount

 Also 10% GST of total Bill Amount

 Then you have to ask for carry bag to customer
 if he/she yes then add 10 rupees in total bill amount.

 if the customer is female then you have to gift a Cadeberry
 If the customer is male then you have to gift a Ladger Wallet

 Develop a Java Application to Generate the Bill in 
 Following Format

                         D-Mart
   Name : Cheeku Sing			Date: 12/9/2022
   -----------------------------------------------------------
   Item Name	Quantity    Price	Total   After-Discount		                      
     Item-1	   5	      10        50 Rs       47.5 Rs
     Item-2	   3	      20	60 RS       60.0 RS	
       .
       .
       .
       .
       .
       .
       .
     Item-10	  20        100         2000       300.0 Rs
   ----------------------------------------------------------
                                        A.P	    D.P	
                                        45000	    43500 
     Gift :- Cadeberry                  0.00	    0.00

     Carry Bag : yes                    10:00	    10:00
     GST (10%)	                        450         450
   ---------------------------------------------------------
                                        45460       43960 RS

                       Thank You
                        To Vist
                         D-Mart                 

   ---------------------------------------------------------- */

import java.util.Scanner;

public class Dmart {
    public static void main(String[] args) {
        // Input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name: ");
        String name = sc.nextLine();
        System.out.println("Enter your Gender(m/f): ");
        char gen = sc.next().charAt(0);
        System.out.println("do you want Carry bag:(yes/no) ");
        char bag = sc.next().charAt(0);
        // Item input
        System.out.println("Enter Quantity of Item-1:");
        int q1 = sc.nextInt();
        System.out.println("Enter Quantity of Item-2:");
        int q2 = sc.nextInt();
        System.out.println("Enter Quantity of Item-3:");
        int q3 = sc.nextInt();
        System.out.println("Enter Quantity of Item-4:");
        int q4 = sc.nextInt();
        System.out.println("Enter Quantity of Item-5:");
        int q5 = sc.nextInt();
        System.out.println("Enter Quantity of Item-6:");
        int q6 = sc.nextInt();
        System.out.println("Enter Quantity of Item-7:");
        int q7 = sc.nextInt();
        System.out.println("Enter Quantity of Item-8:");
        int q8 = sc.nextInt();
        System.out.println("Enter Quantity of Item-9:");
        int q9 = sc.nextInt();
        System.out.println("Enter Quantity of Item-10:");
        int q10 = sc.nextInt();
        // Defined Cost
        float costIt1 = 10f;
        float costIt2 = 20f;
        float costIt3 = 30f;
        float costIt4 = 40f;
        float costIt5 = 50f;
        float costIt6 = 60f;
        float costIt7 = 70f;
        float costIt8 = 80f;
        float costIt9 = 90f;
        float costIt10 = 100f;
        // defined before cost
        float BcostIt1 = 0f;
        float BcostIt2 = 0f;
        float BcostIt3 = 0f;
        float BcostIt4 = 0f;
        float BcostIt5 = 0f;
        float BcostIt6 = 0f;
        float BcostIt7 = 0f;
        float BcostIt8 = 0f;
        float BcostIt9 = 0f;
        float BcostIt10 = 0f;
        // defined after cost
        float AcostIt1 = 0f;
        float AcostIt2 = 0f;
        float AcostIt3 = 0f;
        float AcostIt4 = 0f;
        float AcostIt5 = 0f;
        float AcostIt6 = 0f;
        float AcostIt7 = 0f;
        float AcostIt8 = 0f;
        float AcostIt9 = 0f;
        float AcostIt10 = 0f;
        // IF ELSE
        if (q1 > 4) {
            BcostIt1 = (float) q1 * costIt1;
            AcostIt1 = BcostIt1 - (0.05f) * BcostIt1;
        } else {
            BcostIt1 = (float) q1 * costIt1;
            AcostIt1 = BcostIt1;
        }
        if (q2 >= 1) {
            BcostIt2 = (float) q2 * costIt2;
            AcostIt2 = BcostIt2;
        }
        if (q3 >= 1) {
            BcostIt3 = (float) q3 * costIt3;
            AcostIt3 = BcostIt3;
        }
        if (q4 >= 1) {
            BcostIt4 = (float) q4 * costIt4;
            AcostIt4 = BcostIt4;
        }
        if (q5 >= 1) {
            BcostIt5 = q5 * costIt5;
            AcostIt5 = BcostIt5 - (10f / 100) * BcostIt5;
        }
        if (q6 >= 1) {
            BcostIt6 = q6 * costIt6;
            AcostIt6 = BcostIt6;
        }
        if (q7 >= 1) {
            BcostIt7 = q7 * costIt7;
            AcostIt7 = BcostIt7;
        }
        if (q8 >= 1) {
            BcostIt8 = q8 * costIt8;
            AcostIt8 = BcostIt8;
        }
        if (q9 >= 1) {
            BcostIt9 = q9 * costIt9;
            AcostIt9 = BcostIt9;
        }
        if (q10 >= 1) {
            BcostIt10 = q10 * costIt10;
            AcostIt10 = BcostIt10 - (15f / 100) * BcostIt10;
        }
        // Gift
        float b = 0.0f;
        if (bag == 'y') {
            b = 10.f;
        } else {
            b = 0.0f;
        }
        String giftfinal = "null";
        if (gen == 'f') {
            giftfinal = "Cedebbary";
            System.out.println("female");
        } else if (gen == 'm') {
            giftfinal = "Lagder Wallet";
        } else {
            System.out.println("Invalid ");
        }
        // defined Total
        float total = 0f, gst = 0f, Btotal = 0f, Atotal = 0f;
        Btotal = BcostIt1 + BcostIt2 + BcostIt3 + BcostIt4 + BcostIt5 + BcostIt6 + BcostIt7 + BcostIt8 + BcostIt9
                + BcostIt10;
        Atotal = AcostIt1 + AcostIt2 + AcostIt3 + AcostIt4 + AcostIt5 + AcostIt6 + AcostIt7 + AcostIt8 + +AcostIt9
                + AcostIt10;
        // Gst
        float gstb = (0.10f) * Btotal;
        float gsta = (0.10f) * Atotal;
        // AP BP
        float ap = Btotal + b + gstb;
        float dp = Atotal + b + gsta;
        // If else AP DP
        float dpTotal = dp;
        if (dp > 10000) {
            dpTotal = dp - dp * (0.15f);
        } else if (dp >= 5000 || dp <= 10000) {
            dpTotal = dp - dp * (0.10f);
        } else {
            dpTotal = dp;
        }
        // Bill format
        System.out.println("\t \t\t     Dmart");
        System.out.println("Name: " + name + "\t\t" + "\tDate:09/06/2023");
        System.out.println("--------------------------------------------------------------");
        System.out.println("Item Name \t Quantity \t Price \t Total \t After Discount");

        System.out.println("Item 1 \t\t" + q1 + "\t\t" + costIt1 + "\t " + BcostIt1 + "\t\t " + AcostIt1);
        System.out.println("Item 2 \t\t" + q2 + "\t\t" + costIt2 + "\t " + BcostIt2 + "\t\t " + AcostIt2);
        System.out.println("Item 3 \t\t" + q3 + "\t\t" + costIt3 + "\t " + BcostIt3 + "\t\t " + AcostIt3);
        System.out.println("Item 4 \t\t" + q4 + "\t\t" + costIt4 + "\t " + BcostIt4 + "\t\t " + AcostIt4);
        System.out.println("Item 5 \t\t" + q5 + "\t\t" + costIt5 + "\t " + BcostIt5 + "\t\t " + AcostIt5);
        System.out.println("Item 6 \t\t" + q6 + "\t\t" + costIt6 + "\t " + BcostIt6 + "\t\t " + AcostIt6);
        System.out.println("Item 7 \t\t" + q7 + "\t\t" + costIt7 + "\t " + BcostIt7 + "\t\t " + AcostIt7);
        System.out.println("Item 8 \t\t" + q8 + "\t\t" + costIt8 + "\t " + BcostIt8 + "\t\t " + AcostIt8);
        System.out.println("Item 9 \t\t" + q9 + "\t\t" + costIt9 + "\t " + BcostIt9 + "\t\t " + AcostIt9);
        System.out.println("Item 10 \t" + q10 + "\t        " + costIt10 + "\t " + BcostIt10 + "\t\t " + AcostIt10);

        System.out.println("--------------------------------------------------------------");
        System.out.println("\t\t\t\t\t A.P.       D.P.");
        System.out.println("Total:    \t\t\t\t" + Btotal + "      " + Atotal);
        System.out.println("Gift :-" + giftfinal + "\t\t\t" + "0.0         0.0");
        System.out.println("Carry bag : " + bag + "\t\t\t\t" + b + "\t     " + b);
        System.out.println("GST (10%) :- \t\t\t\t" + gstb + "       " + gsta);
        System.out.println("--------------------------------------------------------------\n");
        System.out.println("Total:-\t\t\t\t\t " + ap + "\t " + dp + " RS");
        System.out.println("Final Discount:-\t\t\t\t " + dpTotal + " RS");
        System.out.println("\t\t\tThankyou");
        System.out.println("\t\t\tTo Visit");
        System.out.println("\t\t\tD-Mart\n");
        System.out.println("--------------------------------------------------------------");
    }
}