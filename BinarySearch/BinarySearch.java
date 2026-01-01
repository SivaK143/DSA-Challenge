package BinarySearch;

public class BinarySearch {

    static int binarySearch(int []arr, int target){
        int n=arr.length;
        int start=0,end=n-1,mid;
        while(start<=end){
            mid=start+(end-start)/2;
            if(arr[mid]==target) return mid;
            else if (arr[mid]<target) start=mid+1;
            else end=mid-1;
        }
        return -1;
    }


    public static void main(String[] args) {
        int[] arr = {2, 3, 6, 8, 10, 12, 15, 16};
        int target = 6;
        System.out.println(binarySearch(arr,target));
    }
}
