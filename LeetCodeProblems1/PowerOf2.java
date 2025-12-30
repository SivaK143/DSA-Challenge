package LeetCodeProblems1;

public class PowerOf2 {


    public static void main(String[] args) {
        int num=32;
        while(num%2!=1){
            if(num%2==1) System.out.println("not power of 2");
            num/=2;
        }
        System.out.println("power of 2");



    }
}
