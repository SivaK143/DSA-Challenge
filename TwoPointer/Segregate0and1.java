package TwoPointer;

import java.util.Arrays;

public class Segregate0and1 {

    static void segregate(int []arr){
        int start=0,end=arr.length-1;
        while(start<end){
            if(arr[start]==0){
                start++;
            }else{//here arr[start]==1
                //check if arr[end]==0 then swap else decrease end--
                if(arr[end]==0){
                    //swap
                    int temp=arr[start];
                    arr[start]=arr[end];
                    arr[end]=temp;
                }else{
                    end--;
                }
            }
        }
    }

    public static void main(String[] args) {
        int []arr={1, 1, 1, 1};
        segregate(arr);
        System.out.println(Arrays.toString(arr));
    }
}
