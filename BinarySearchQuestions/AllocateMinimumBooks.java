package BinarySearchQuestions;

public class AllocateMinimumBooks {

    static int allocateBooks(int arr[], int numberOfStudents){
        int n=arr.length;
        if(numberOfStudents>n) return -1;
        int start=0,end=0,mid,ans=-1;
        //initializing start and end with max and sumof arr
        for(int i=0;i<n;i++){
            start=Math.max(start,arr[i]);
            end+=arr[i];
        }
        while(start<=end){
            mid=start+(end-start)/2;
            //allocate books for students
            int pages=0,count=1;
            for(int i=0;i<n;i++){
                pages+=arr[i];
                //if pages greater than mid assign it to second student
                if(pages>mid){
                    count++;
                    pages=arr[i];
                }
            }
            if(count<=numberOfStudents){
                ans=mid;
                end=mid-1;
            }else start=mid+1;
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[]={12,34,67,90};
        System.out.println(allocateBooks(arr, 2));
    }
}
