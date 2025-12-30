package Sorting;

import java.util.Arrays;

public class Selectionsort {

    static void selectionSort(int []arr){
        int index;
        for(int i=0;i<arr.length-1;i++){
            index =i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[index]) index=j;
            }
            //swap
            int temp=arr[i];
            arr[i]=arr[index];
            arr[index]=temp;
        }
    }

    public static void main(String[] args) {
        int []arr={10,8,2,3,1,4};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
