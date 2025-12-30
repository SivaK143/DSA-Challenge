package Arrays;

import java.util.Arrays;

public class ReverseArray {

    static int[] reverse(int[]arr){
        int n = arr.length;
        int[] arr2= new int[arr.length];
        //copy the values to new arr in reverse order
        for(int i=0; i<n; i++){
            arr2[i] = arr[n-i-1];
        }
        //place same values in original arr
        for(int i=0; i<n; i++){
            arr[i]=arr2[i];
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = {6,11,7,4,8,9};
        reverse(arr);
        System.out.println(Arrays.toString(arr));

    }
}
