package LeetCodeProblems1;

public class NumberPalindrome {

    public static boolean palindrome(int x){
        int ans=0,rem;
        int temp = x;
        while(x!=0){
            rem = x%10;
            x/=10;
            ans=ans*10+rem;
        }
        return ans==temp;
    }
    public static void main(String[] args) {
        System.out.println(palindrome(121));
    }
}
