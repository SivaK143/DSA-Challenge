package BinarySearchQuestions;

public class CountFreq {

    static int countFrequency(int []arr, int target){
        int start=0,end=arr.length-1,mid,first=-1,last=-1;
        //left psoition
        while (start<=end){
            mid=start+(end-start)/2;
            if(arr[mid]==target){
                first=mid;
                end=mid-1;
            }else if(arr[mid]<target) start=mid+1;
            else end=mid-1;
        }
        //right position
        start=0;end=arr.length-1;
        while (start<=end){
            mid=start+(end-start)/2;
            if(arr[mid]==target){
                last=mid;
                start=mid+1;
            }else if(arr[mid]<target) start=mid+1;
            else end=mid-1;
        }
        return (first==-1&&last==-1)?0:last-first+1;
    }

    public static void main(String[] args) {
        int []arr={1, 1, 2, 2, 2, 2, 3};
        int target=0;
        System.out.println(countFrequency(arr,target));
    }
}
