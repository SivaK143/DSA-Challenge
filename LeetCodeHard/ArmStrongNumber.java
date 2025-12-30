package LeetCodeHard;

public class ArmStrongNumber {

    public static int count(int n){
        int count=0;
        while(n!=0){
            count++;
            n/=10;
        }
        return count;
    }

    public static boolean isArmstrong(int num, int count){
        int ans =0,rem, temp=num;
        while (num!=0){
            rem=num%10;
            num/=10;
            ans=ans+(int)Math.pow(rem,count);
        }
        return temp==ans;
    }

    public static void main(String[] args) {
        int n =123;
        int digits = count(n);
        System.out.println(isArmstrong(n,digits));

    }
}
