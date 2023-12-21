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
        float bcostIt1, bcostIt2, bcostIt3, bcostIt4, bcostIt5, bcostIt6, bcostIt7, bcostIt8, bcostIt9, bcostIt10;
        bcostIt1 = bcostIt2 = bcostIt3 = bcostIt4 = bcostIt5 = bcostIt6 = bcostIt7 = bcostIt8 = bcostIt9 = bcostIt10 = 0.0f;
        // defined after cost
        float acostIt1, acostIt2, acostIt3, acostIt4, acostIt5, acostIt6, acostIt7, acostIt8, acostIt9, acostIt10;
        acostIt1 = acostIt2 = acostIt3 = acostIt4 = acostIt5 = acostIt6 = acostIt7 = acostIt8 = acostIt9 = acostIt10 = 0.0f;
        // IF ELSE
        if (q1 > 4) {
            bcostIt1 = (float) q1 * costIt1;
            acostIt1 = bcostIt1 - (0.05f) * bcostIt1;
        } else {
            bcostIt1 = (float) q1 * costIt1;
            acostIt1 = bcostIt1;
        }
        if (q2 >= 1) {
            bcostIt2 = (float) q2 * costIt2;
            acostIt2 = bcostIt2;
        }
        if (q3 >= 1) {
            bcostIt3 = (float) q3 * costIt3;
            acostIt3 = bcostIt3;
        }
        if (q4 >= 1) {
            bcostIt4 = (float) q4 * costIt4;
            acostIt4 = bcostIt4;
        }
        if (q5 >= 1) {
            bcostIt5 = q5 * costIt5;
            acostIt5 = bcostIt5 - (10f / 100) * bcostIt5;
        }
        if (q6 >= 1) {
            bcostIt6 = q6 * costIt6;
            acostIt6 = bcostIt6;
        }
        if (q7 >= 1) {
            bcostIt7 = q7 * costIt7;
            acostIt7 = bcostIt7;
        }
        if (q8 >= 1) {
            bcostIt8 = q8 * costIt8;
            acostIt8 = bcostIt8;
        }
        if (q9 >= 1) {
            bcostIt9 = q9 * costIt9;
            acostIt9 = bcostIt9;
        }
        if (q10 >= 1) {
            bcostIt10 = q10 * costIt10;
            acostIt10 = bcostIt10 - (15f / 100) * bcostIt10;
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
        float total = 0f, gst = 0f, bTotal = 0f, aTotal = 0f;
        bTotal = bcostIt1 + bcostIt2 + bcostIt3 + bcostIt4 + bcostIt5 + bcostIt6 + bcostIt7 + bcostIt8 + bcostIt9
                + bcostIt10;
        aTotal = acostIt1 + acostIt2 + acostIt3 + acostIt4 + acostIt5 + acostIt6 + acostIt7 + acostIt8 + +acostIt9
                + acostIt10;
        // Gst
        float gstb = (0.10f) * bTotal;
        float gsta = (0.10f) * aTotal;
        // AP BP
        float ap = bTotal + b + gstb;
        float dp = aTotal + b + gsta;
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
        System.out.println("Item 1 \t\t" + q1 + "\t\t" + costIt1 + "\t " + bcostIt1 + "\t\t " + acostIt1);
        System.out.println("Item 2 \t\t" + q2 + "\t\t" + costIt2 + "\t " + bcostIt2 + "\t\t " + acostIt2);
        System.out.println("Item 3 \t\t" + q3 + "\t\t" + costIt3 + "\t " + bcostIt3 + "\t\t " + acostIt3);
        System.out.println("Item 4 \t\t" + q4 + "\t\t" + costIt4 + "\t " + bcostIt4 + "\t\t " + acostIt4);
        System.out.println("Item 5 \t\t" + q5 + "\t\t" + costIt5 + "\t " + bcostIt5 + "\t\t " + acostIt5);
        System.out.println("Item 6 \t\t" + q6 + "\t\t" + costIt6 + "\t " + bcostIt6 + "\t\t " + acostIt6);
        System.out.println("Item 7 \t\t" + q7 + "\t\t" + costIt7 + "\t " + bcostIt7 + "\t\t " + acostIt7);
        System.out.println("Item 8 \t\t" + q8 + "\t\t" + costIt8 + "\t " + bcostIt8 + "\t\t " + acostIt8);
        System.out.println("Item 9 \t\t" + q9 + "\t\t" + costIt9 + "\t " + bcostIt9 + "\t\t " + acostIt9);
        System.out.println("Item 10 \t" + q10 + "\t        " + costIt10 + "\t " + bcostIt10 + "\t\t " + acostIt10);
        System.out.println("--------------------------------------------------------------");
        System.out.println("\t\t\t\t\t A.P.       D.P.");
        System.out.println("Total:    \t\t\t\t" + bTotal + "      " + aTotal);
        System.out.println("Gift :-" + giftfinal + "\t\t\t" + "0.0         0.0");
        System.out.println("Carry bag : " + bag + "\t\t\t\t" + b + "\t     " + b);
        System.out.println("GST (10%) :- \t\t\t\t" + gstb + "       " + gsta);
        System.out.println("--------------------------------------------------------------\n");
        System.out.println("Total:-\t\t\t\t\t " + ap + "\t " + dp + " RS");
        System.out.println("Final Discount:-\t\t\t\t  " + dpTotal + " RS");
        System.out.println("\t\t\tThankyou");
        System.out.println("\t\t\tTo Visit");
        System.out.println("\t\t\tD-Mart\n");
        System.out.println("--------------------------------------------------------------");
    }
}