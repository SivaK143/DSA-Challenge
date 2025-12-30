package Pattern.Hard;

import java.util.Scanner;

public class Nine {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
        int n = sc.nextInt();
        for(int row=n; row>=1; row--){
            //stars
            for(int col=1; col<=row; col++){
                System.out.print("* ");
            }
            //spaces
            for(int col=1; col<=2*n - 2*row; col++){
                System.out.print("  ");
            }
            //stars
            for(int col=1; col<=row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int row=1; row<=n; row++){
            //stars
            for(int col=1; col<=row; col++){
                System.out.print("* ");
            }
            //spaces
            for(int col=1; col<=2*n - 2*row; col++){
                System.out.print("  ");
            }
            //stars
            for(int col=1; col<=row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
