//906609
public class Sanchez5 {
    public static boolean palindrome(int number){
        int firstNumber = number;
        int reversed = 0;
        while(number>0){
            int digit = number % 10;
            reversed = reversed * 10 +digit;
            number/=10;
        }
        return firstNumber == reversed;
    }
    public static  int findLargestPalindrome(int start, int end){
        int LargestPalindrome =0;
        for (int i = start; i<=end;i++){
            for (int j = i; j<= end; j++){
                int product = i* j;
                if(palindrome(product) && product >LargestPalindrome){
                    LargestPalindrome = product;
                }
            }
        }
        return LargestPalindrome;
    }
    public static void main(String[] args) {
        int start = 100;
        int end =999;

        int LargestPalindrome = findLargestPalindrome(start,end);
        System.out.println(LargestPalindrome);

    }
}
