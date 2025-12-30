package Arrays;

public class MissingNumberinArr {
    static int missing(int arr[]){
        long n=arr.length+1;
        long totalSum=0;
        for(int i=0;i<arr.length;i++){
            totalSum+=arr[i];
        }
        return (int)(((n*(n+1)/2)) - totalSum);
    }

    public static void main(String[] args) {
        int arr[]={1, 2, 3, 5};
        System.out.println(missing(arr));
    }
}
