package LeetCodeProblems1;

public class Sqrt {

    public static int sqrt(int x){
        for (int i = 1; ; i++) {
            if (i > x/i) {
                return i-1;
            }
            if (i == x/i) {
                return i;
            }
        }
    }

    public static void main(String[] args) {
        int x =15;
        System.out.println(sqrt(x));

    }
}
