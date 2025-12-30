package Pattern.Hard;

import java.util.Scanner;

public class Ten {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
        int n = sc.nextInt();
        //first part
        for (int row = 1; row <= n; row++) {
            //stars
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            //spaces
            for (int col = 1; col <= 2 * n - 2 * row; col++) {
                System.out.print("  ");
            }
            //stars
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();

        }

        //second part
        for (int row = n-1; row >= 1; row--) {
            //stars
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            //spaces
            for (int col = 1; col <= 2 * n - 2 * row; col++) {
                System.out.print("  ");
            }
            //stars
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
