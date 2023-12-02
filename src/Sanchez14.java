//837799
public class Sanchez14 {
    public static void main(String[] args) {

        long maxChain =0;
        long StartingNumber =0;
        for (long i = 1; i < 1000000; i++) {
            long counter = 0;
            long n = i;
            while (n > 1) {

                if (n % 2 == 0) {
                    n /= 2;
                } else {
                    n = 3 * n + 1;
                }
                counter++;

            }
            if(counter > maxChain){
                maxChain = counter;
                StartingNumber =i;
            }
        }
        System.out.println(StartingNumber);


    }
}
