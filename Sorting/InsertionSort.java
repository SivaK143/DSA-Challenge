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

    static void insertion(int []arr){
        int n=arr.length;
        for(int i=1;i<n;i++){
            for(int j=i;j>0;j--){
                if(arr[j-1]<arr[j]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }else break;
            }
        }
    }

    static void insertionSortFromEnd(int []arr){
        int n=arr.length;
        for(int i=n-2;i>=0;i--){
            for(int j=i;j<n-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }else break;
            }
        }
    }

    public static void main(String[] args) {
        int []arr={7,4,2,3,5};
//        insertionSort(arr);
//        insertion(arr);
        insertionSortFromEnd(arr);
        System.out.println(Arrays.toString(arr));
    }
}
