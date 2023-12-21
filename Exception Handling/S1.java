import java.lang.Math;
import java.math.BigInteger;

public class S1 {
    public static void main(String[] args) {
        String s1 = "213013463567812345";
        String s2 = "21301346352678";

        BigInteger bigInt = new BigInteger(s1);
        BigInteger bigInt2 = new BigInteger(s2);
        
        BigInteger result = bigInt.multiply(bigInt2);

        System.out.println(result);

    }
}
