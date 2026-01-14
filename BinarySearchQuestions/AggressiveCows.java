package BinarySearchQuestions;

import java.util.Arrays;

public class AggressiveCows {

    static int findMinCowsDistance(int stalls[], int k){
        int n=stalls.length;
        int start=1,end,mid;
        //sort the arr
        Arrays.sort(stalls);
        end=stalls[n-1]-stalls[0];
        while (start<=end){
            mid=start+(end-start)/2;
            int pos=stalls[0], count=1;
            for(int i=1;i<n;i++){
                if(pos+mid<=stalls[i]){
                    count++;
                    pos=stalls[i];
                }
            }
            if(count<k) end=mid-1;
            else start=mid+1;
        }
        return end;
    }

    public static void main(String[] args) {
        int stalls[]={10, 1, 2, 7, 5};
        int k=3;
        System.out.println(findMinCowsDistance(stalls,k));
    }
}
