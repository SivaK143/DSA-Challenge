package BinarySearchQuestions;

public class SearchInsertPosition {

    static int searchInsertPosition(int []arr, int target){
        int start=0,end=arr.length-1,mid;
        while(start<=end){
            mid=start+(end-start)/2;
            if(arr[mid]==target) return mid;
            else if(arr[mid]<target) start=mid+1;
            else end=mid-1;
        }
        return start;
    }

    public static void main(String[] args) {
        int []arr={1,3,5,6};
        int target=2;
        System.out.println(searchInsertPosition(arr,target));
    }
}
