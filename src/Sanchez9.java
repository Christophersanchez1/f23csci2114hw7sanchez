//31875000
public class Sanchez9 {
    public static void main(String[] args) {
        for( long i =1; i<1000; i++){
            for (long j = 2; j<1000; j++){
                for(long l = 3; l<1000;l++){
                    if(Math.pow(i, 2) + Math.pow(j, 2) == Math.pow(l, 2)){
                        long sum = i+j+l;
                        if(sum ==1000){
                            long product = i*j*l;
                            System.out.println(product);
                        }
                        }
                    }
                }
            }
        }
    }

