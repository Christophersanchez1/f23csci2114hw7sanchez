//648
import java.math.BigInteger;

public class Sanchez20 {

    static BigInteger factorial(int n)
    {
        BigInteger res = BigInteger.ONE;

        for (int i = 2; i <= n; i++) {
            res = res.multiply(BigInteger.valueOf(i));
        }
        return res;
    }

    public static void main(String[] args) {
        BigInteger number = factorial(100);
        String numberStr = number.toString();
        long Sum = 0;
        for (int i = 0; i< numberStr.length(); i++) {
            Sum += Character.getNumericValue(numberStr.charAt(i));
        }
        System.out.println(Sum);
    }

}
