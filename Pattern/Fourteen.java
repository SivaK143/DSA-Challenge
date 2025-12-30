package Pattern;

public class Fourteen {

    public static void main(String[] args) {
        for(int row=1; row<=5; row++) {
            char name = (char) ('a' + (row - 1));
            for(int col = 1; col<=row; col++){
                System.out.print(name + " ");
            }
            System.out.println();
        }
    }
}
