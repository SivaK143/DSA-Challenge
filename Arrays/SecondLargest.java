package Arrays;

public class SecondLargest {

    static int findSecondlargest(int arr[]){
        int largest=-1,secondLargest=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                secondLargest=largest;
                largest=arr[i];
            }else if(arr[i]>secondLargest && arr[i]!=largest) secondLargest=arr[i];
        }
        return secondLargest;
    }

    static int findSecondLargest(int []arr){
        //assume array contains all positive numbers
        int ans=-1;
        //find largest
        for(int i=0;i<arr.length;i++){
            if(arr[i]>ans) ans=arr[i];
        }
        //find second largest
        int second=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=ans) second=Math.max(second,arr[i]);
        }
        return second;
    }

    public static void main(String[] args) {
        int []arr = {2,6,4,3,8,5,1};
        System.out.println(findSecondLargest(arr));
        System.out.println(findSecondlargest(arr));
    }
}
