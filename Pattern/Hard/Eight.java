package Pattern.Hard;

import java.util.Scanner;

public class Eight {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
        int n = sc.nextInt();
        for(int row=n; row>=1; row--){
            //sapces
            for(int col=n-row; col>=1; col--){
                System.out.print("  ");
            }
            //stars
            for(int col=2*row-1; col>=1; col--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
