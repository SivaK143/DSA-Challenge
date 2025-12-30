package LeetCodeHard;

public class BishopMoves {

    static int countWays(int A, int B){
        int total=0;
        total+=Math.min(8-A,8-B) + Math.min(8-A,B-1) + Math.min(A-1,B-1)+Math.min(A-1,8-B);
        return total;
    }

    public static void main(String[] args) {
        int A=3,B=4;
        System.out.println(countWays(3,4));
    }
}
