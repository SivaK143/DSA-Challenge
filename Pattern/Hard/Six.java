package Pattern.Hard;

import java.util.Scanner;

public class Six {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
        int n = sc.nextInt();
        for(int row=1; row<=n; row++){
            //spaces
            for(int col=1; col<=n-row; col++){
                System.out.print("  ");
            }
            //stars
            for(int col=1; col<=2*row-1; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
