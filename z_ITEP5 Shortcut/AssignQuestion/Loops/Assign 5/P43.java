// 43) WAP to convert binary number into decimal number

public class P43 {
    public static void main(String[] args) {
        int num = 1000, binary_num, decimal_num = 0, base = 1, rem;

        binary_num = num;
        while (num > 0) {
            rem = num % 10;
            decimal_num = decimal_num + rem * base;
            num = num / 10;
            base = base * 2;
        }
        System.out.println(base);

    }
}
