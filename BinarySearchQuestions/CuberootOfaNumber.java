package BinarySearchQuestions;

public class CuberootOfaNumber {

    static int cubeRoot(int n){
        int start=1,end=n,mid;
        while (start<=end){
            mid=start+(end-start)/2;
            if(mid*mid*mid==n) return mid;
            else if(mid*mid*mid<n) start=mid+1;
            else end=mid-1;
        }
        return end;
    }
    public static void main(String[] args) {
        int n=3;
        System.out.println(cubeRoot(n));
    }
}
