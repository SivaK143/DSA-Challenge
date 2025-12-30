package Arrays;

import java.util.Arrays;

public class ReverseArray2 {

    static void reverse(int[] arr){
        int start=0, end = arr.length-1;
        while(start<=end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int arr[] = {6,11,7,4,8,9};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
}
