package BinarySearchQuestions;

public class Squareroot {

    static int squareRootAlt(int x){
        int start=1,end=x,mid,ans=0;
        while(start<=end){
            mid=start+(end-start)/2;
            if(mid*mid==x) {
                ans=mid;
                break;
            }
            else if(mid*mid<x){
                ans=mid;
                start=mid+1;
            }
            else end=mid-1;
        }
        return ans;
    }

    static int squareRoot(int x){
        int start=1,end=x,mid;
        while(start<=end){
            mid=start+(end-start)/2;
            if(mid*mid==x) return mid;
            else if(mid*mid<x) start=mid+1;
            else end=mid-1;
        }
        return end;
    }

    public static void main(String[] args) {
        int x=24;
        System.out.println(squareRoot(x));
        System.out.println(squareRootAlt(x));

    }
}
