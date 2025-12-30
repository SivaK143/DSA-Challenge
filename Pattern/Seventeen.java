package Pattern;

public class Seventeen {

    public static void main(String[] args) {
        for(int row=5; row>=1; row--){
            for(int col=5; col>row-1; col--){
                System.out.print(col + " ");
            }
            System.out.println();
        }


    }
}
