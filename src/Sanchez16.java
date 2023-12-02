//1366
import java.math.BigInteger;

public class Sanchez16 {
    public static void main(String[] args) {
        BigInteger power = new BigInteger("2");
        BigInteger number = power.pow(1000);

        String numberStr = number.toString();
        long Sum = 0;
            for (int i = 0; i< numberStr.length(); i++) {
                Sum += Character.getNumericValue(numberStr.charAt(i));
            }

        System.out.println(Sum);
        }

    }

