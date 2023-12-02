//142913828922
public class Sanchez10 {
    static long number= 0;
    public static void main(String[] args) {
        for(long i= 0; i<2000000;  i++){
            if(isPrime(i)){
                number = number+i;
            }
        }
        System.out.println(number);
    }

    public static  boolean isPrime(long number){
        if(number<=1){
            return false;
        }
        for(int i =2;i<= Math.sqrt(number);i++){
            if(number % i == 0) {
                return false;
            }
        }
        return true;
    }
}

