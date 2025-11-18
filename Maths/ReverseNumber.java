package Maths;

public class ReverseNumber {

    static int reverseNum(int n){
        int newVal =0;
        while(n > 0){
            int rem = n% 10;
            newVal = (newVal * 10) + rem;
            n /=10;
        }
        return newVal;
    }

    public static void main(String[] args) {
        System.out.println(reverseNum(71845));
    }
}
