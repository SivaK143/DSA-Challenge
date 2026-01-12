package BinarySearchQuestions;

public class PainterPartition {

    static int painterPartition(int []arr, int painters){
        int n=arr.length;
        int start=0, end=0,mid, ans=-1;
        for(int i=0;i<n; i++){
            start=Math.max(start, arr[i]);
            end+=arr[i];
        }
        while(start<=end){
            mid=start+(end-start)/2;
            int units=0, count=1;
            for(int i=0;i<n;i++){
                units+=arr[i];
                if(units>mid){
                    count++;
                    units=arr[i];
                }
            }
            if(count<=painters){
                ans=mid;
                end=mid-1;
            }else start=mid+1;
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[]={5,10,30,20,15};
        int k=3;
        System.out.println(painterPartition(arr, k));
    }
}
