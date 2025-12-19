package Pattern;

public class Nine {

    public static void main(String[] args) {
        int count = 1;
        for(int row = 1; row<=5; row++){
            for(int col = 1; col<=5; col++){
                System.out.print(count++ + "  ");
            }
            System.out.println();
        }
    }
}
