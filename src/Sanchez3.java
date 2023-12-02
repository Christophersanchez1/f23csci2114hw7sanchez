//6857
import java.math.BigInteger;
public class Sanchez3 {
    public static void main(String[] args) {
        BigInteger number = new BigInteger("600851475143");
        BigInteger largePrime = new BigInteger("-1");
        while (number.mod(BigInteger.valueOf(2)).equals(BigInteger.ZERO)) {
            largePrime = BigInteger.valueOf(2);
            number = number.divide(BigInteger.valueOf(2));
        }

        while (number.mod(BigInteger.valueOf(3)).equals(BigInteger.ZERO)) {
            largePrime = BigInteger.valueOf(3);
            number = number.divide(BigInteger.valueOf(3));
        }

        BigInteger factor = BigInteger.valueOf(5);
        BigInteger increment = BigInteger.valueOf(2);

        while (factor.multiply(factor).compareTo(number) <= 0) {
            while (number.mod(factor).equals(BigInteger.ZERO)) {
                largePrime = factor;
                number = number.divide(factor);
            }
            factor = factor.add(increment);
            increment = BigInteger.valueOf(6 - increment.intValue());
        }

        if (number.compareTo(BigInteger.valueOf(1)) > 0) {
            largePrime = number;
        }

        System.out.println(largePrime);
    }




}
