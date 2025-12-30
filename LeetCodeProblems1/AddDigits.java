package LeetCodeProblems1;

public class AddDigits {

    public static void main(String[] args) {
        int num = 38;
        while(num>9) {
            int ans = 0, rem;
            while (num != 0) {
                rem = num % 10;
                num /= 10;
                ans += rem;
            }
            num = ans;
        }
        System.out.println(num);
    }
}
