package Pattern;

public class Sixth {

    public static void main(String[] args) {

        for(int row=1; row<=5; row++){
            for(int col=0; col<5; col++){
                System.out.print((char)('a' + col) + " ");
            }
            System.out.println();
        }
    }
}
