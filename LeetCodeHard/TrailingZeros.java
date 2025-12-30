package LeetCodeHard;

public class TrailingZeros {

    public static int trailing(int n){
        int result=0;
        while(n>5){
            result=result+n/5;
            n/=5;
        }
        return result;
    }

    public static void main(String[] args) {
        int n = 6;
        System.out.println(trailing(n));
    }
}
