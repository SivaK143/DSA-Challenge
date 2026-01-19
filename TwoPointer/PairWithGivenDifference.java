package TwoPointer;

public class PairWithGivenDifference {

    static boolean isPairExist(int []arr, int diff){
        int start=0,end=1;
        while(end<arr.length){
            if(arr[end]-arr[start]==diff) return true;
            else if(arr[end]-arr[start]<diff) end++;
            else start++;
        }
        return false;
    }

    public static void main(String[] args) {
        int []arr={5,10,2,3,50,80};
        int diff=45;
        System.out.println(isPairExist(arr,diff));
    }
}
