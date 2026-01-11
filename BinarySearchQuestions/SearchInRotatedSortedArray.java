package BinarySearchQuestions;

public class SearchInRotatedSortedArray {

    static int searchElement(int []arr, int target){
        int start=0,end=arr.length-1,mid;
        while (start<=end){
            mid=start+(end-start)/2;
            if(arr[mid]==target) return mid;
            //left side sorted
            else if(arr[mid]>arr[0]){
                //check whether target is in this range
                if(target>arr[0]&&target<arr[mid]) end=mid-1;
                else start=mid+1;
            }else{
                //check whether target is in this range
                if(target>arr[mid]&&target<arr[end]) start=mid+1;
                else end=mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2};
        System.out.println(searchElement(arr, 0));
    }
}
