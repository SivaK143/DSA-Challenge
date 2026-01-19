package Maths;

public class Palindrome {

    static boolean isPalindrome(int num){
        int temp=num, rem,rev=0;
        while(num>0){
            rem=num%10;
            rev=rev*10+rem;
            num/=10;
        }
        return rev==temp;
    }

    public static void main(String[] args) {
        int num=1215;
        System.out.println(isPalindrome(num));
    }
}
