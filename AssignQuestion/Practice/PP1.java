class Test111 {
    public void electricBill(int unit) {
        int charge = 0;
        if (unit >= 1 && unit <= 100)
            charge = 10;
        else if (unit >= 100 && unit <= 200)
            charge = 15;
        else if (unit >= 200 && unit <= 300)
            charge = 20;
        else if (unit >= 300)
            charge = 25;
        int bill = unit * charge;
        System.out.println("Bill: " + bill);
    }
}

public class PP1 {
    public static void main(String[] args) {
        Test111 obj = new Test111();
        obj.electricBill(150);
    }
}
