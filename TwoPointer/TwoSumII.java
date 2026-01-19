package TwoPointer;

import java.util.Arrays;

public class TwoSumII {

    static int[] useBinarySearch(int []arr, int target){
        for(int i=0;i<arr.length-1;i++){
            int x=target-arr[i];
            int start=i+1,end=arr.length-1,mid,ans=0;
            while(start<=end){
                mid=start+(end-start)/2;
                if(arr[mid]==x){
                    return new int[]{mid+1,i+1};
                }else if(arr[mid]<x) start=mid+1;
                else end=mid-1;
            }
        }
        return new int[]{-1,-1};
    }

    static int[] findIndexes(int []arr, int target){
        int start=0,end=arr.length-1;
        while(start<end){
            if(arr[start]+arr[end]==target) return new int[]{start+1,end+1};
            else if(arr[start]+arr[end]<target) start++;
            else end--;
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        int arr[]={2,7,11,15};
        int target=18;
//        System.out.println(Arrays.toString(findIndexes(arr,target)));
        System.out.println(Arrays.toString(useBinarySearch(arr,target)));
    }
}
