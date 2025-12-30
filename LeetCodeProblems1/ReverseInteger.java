package LeetCodeProblems1;

public class ReverseInteger {

    public static void main(String[] args) {
        int num = -621;
        int ans =0, rem;
        while (num != 0){
            rem = num%10;
            num/=10;
            ans=ans*10+rem;
        }
        System.out.println(ans);
        System.out.println(Integer.MAX_VALUE);
    }
}
