//104743
public class Sanchez7 {
    public static void main(String[] args) {
        int nth = 10001;
        int count = 0;
        int number =2;
        while (true){
            if(isPrime(number)){
                count++;
            }
            if (count == nth){
                System.out.println(number);
                break;
            }
            number++;
        }


    }
    public static  boolean isPrime(int number){
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
