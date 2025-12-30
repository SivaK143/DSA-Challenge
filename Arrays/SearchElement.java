package Arrays;

public class SearchElement {

    static int serach(int []arr, int target){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == target) return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {10,20,11,7,8,4};
        int target = 11;
        System.out.println(serach(arr,target));
    }
}
