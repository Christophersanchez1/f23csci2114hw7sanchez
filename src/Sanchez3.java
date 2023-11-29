//232792560
public class Sanchez3 {

   static  int answer =0;
    public static void main(String[] args) {
        int i= 1;
        boolean found = false;

       while (!found){
            boolean divisibleByAll = true;
            for(int d= 1; d <= 20;d++){
               int remainder = i % d;
                if(remainder != 0){
                    divisibleByAll = false;
                    break;
                }
                }
            if(divisibleByAll){
                answer =i;
                found = true;
            }
            i++;
        }
        System.out.println(answer);
    }
}
