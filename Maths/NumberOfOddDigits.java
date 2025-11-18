package Maths;

public class NumberOfOddDigits {

    static int CountOdd(int n){
        int count = 0, rem = 0;
        while(n > 0){
            rem = n%10;
            if(rem % 2 != 0){
                count++;
            }
            n/=10;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(CountOdd(71845));

    }
}
