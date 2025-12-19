package Pattern;

public class Eight {

    public static void main(String[] args) {

        for(int row = 1; row<=5; row++){
            for(char col = 'a'; col<='e'; col++){
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
