package BinarySearchQuestions;

public class KokoEatingBanana {

    static int minTimeToEatBanana(int piles[], int h){
        int n=piles.length;
        int start= 0,end=0,mid;
        for(int i=0;i<n;i++){
            start+=piles[i];
            end=Math.max(end,piles[i]);
        }
        start/=h;
        while(start<=end){
            mid=start+(end-start)/2;
            int total_hours=0;
            for(int i=0;i<n;i++){
                total_hours+=Math.ceil((double) piles[i]/mid);
            }
            if(total_hours>h) start=mid+1;
            else end=mid-1;
        }
        return start;
    }

    public static void main(String[] args) {
        int piles[]={312884470};
        int h=312884469;
        System.out.println(minTimeToEatBanana(piles,h));
    }
}
