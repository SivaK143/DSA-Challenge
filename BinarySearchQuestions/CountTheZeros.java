package BinarySearchQuestions;

public class CountTheZeros {

    static int countZeros(int []arr){
        int start=0, end=arr.length-1,mid,first=-1;
        while(start<=end){
            mid=start+(end-start)/2;
            if(arr[mid]==0) end=mid-1;
            else if(arr[mid]>0) start=mid+1;
            else end=mid-1;
        }
        return (arr.length-1)-start+1;
    }

    public static void main(String[] args) {
        int arr[]={1,1,1,1,1,0,0,0};
        System.out.println(countZeros(arr));

    }
}
