//25164150
public class Sanchez2 {
    public static void main(String[] args) {
        double squaresSum = 0;
        int  squaredSum = 0;
        int difference = 0;

        for(int i = 0; i<=100;i++){
            squaredSum += i;


        }
        squaredSum = squaredSum * squaredSum;

        for(double i = 0; i<=100;i++){
            double a =0;
            a = Math.pow(i,2);
            squaresSum =  squaresSum+a;
        }
      difference = (int) (squaredSum - squaresSum);
        System.out.println(difference);

    }
}
