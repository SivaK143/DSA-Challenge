package Sorting;

import java.util.Arrays;

public class BubbleSortDescOrder {

    static void bubbleSort(int []arr){
        int n =arr.length;
        for(int i=n-2;i>=0;i--){
            boolean isSwapped=false;
            for(int j=0;j<=i;j++){
                if(arr[j]<arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    isSwapped=true;
                }
            }
            if(!isSwapped) return;
        }
    }
    public static void main(String[] args) {
        int []arr={7,4,8,1,5};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
