package BinarySearchQuestions;

import java.util.Arrays;

public class FirstandLastPosition {

    static int[] findFisrtandLastPosition(int []arr, int target){
        int n=arr.length;
        int start=0,end=n-1,mid,first=-1,Last=-1;
        //find first position
        while(start<=end){
            mid=start+(end-start)/2;
            if(arr[mid]==target){
                first=mid;
                end=mid-1;
            }else if(arr[mid]<target) start=mid+1;
            else end=mid-1;
        }
        start=0;
        end=n-1;
        //find Last occurence
        while(start<=end){
            mid=start+(end-start)/2;
            if(arr[mid]==target){
                Last=mid;
                start=mid+1;
            }else if(arr[mid]<target) start=mid+1;
            else end=mid-1;
        }
        return new int[]{first,Last};
    }

    public static void main(String[] args) {
        int []arr={2,3,3,3,3,4,5,6};
        int target=3;
        System.out.println(Arrays.toString(findFisrtandLastPosition(arr,target)));
    }
}
