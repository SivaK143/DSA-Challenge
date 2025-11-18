package Maths;

public class Countdigits {

   static int Count(int n){
        int count = 0;
        while(n>0){
            n /=10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {

        int n = 71845;
        System.out.println(Count(n));
    }
}
