package Pattern.Hard;

import java.util.Scanner;

public class Eleven {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
        int n = sc.nextInt();
        for(int row=1; row<=n; row++){
            //spaces
            for(int col=1; col<=n-row; col++){
                System.out.print(" ");
            }
            //stars
            for(int col=1; col<=row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }

        //second part
        for(int row=n; row>=1; row--){
            //spaces
            for(int col=1; col<=n-row; col++){
                System.out.print(" ");
            }
            //stars
            for(int col=1; col<=row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
