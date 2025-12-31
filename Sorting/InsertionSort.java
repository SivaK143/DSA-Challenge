package Sorting;

import java.util.Arrays;

public class InsertionSort {

    static void insertionSort(int []arr){
        int n=arr.length;
        for(int i=1;i<n;i++){
            for(int j=i;j>0;j--){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }else break;
            }
        }
    }

    public static void main(String[] args) {
        int []arr={7,4,2,3,5};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
