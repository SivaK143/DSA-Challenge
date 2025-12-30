package LeetCodeProblems1;

public class ComplementOfaNumber {

    public static int complement(int n){
        int ans=0,rem,mul=1;
        while(n!=0){
            rem=(n%2)^1;
            n/=2;
            ans=ans+rem*mul; //rem*2^0 rem*2^1 ....
            mul*=2;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(complement(5));
    }
}
