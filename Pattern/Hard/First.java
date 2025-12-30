package Pattern.Hard;

import java.util.Scanner;

public class First {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n");
        int n = sc.nextInt();
        for(int row=1; row<=n; row++){
            //spaces
            for(int i=1; i<=n-row; i++){
                System.out.print("  ");
            }
            //stars print
            for(int col =1; col<=row; col++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
