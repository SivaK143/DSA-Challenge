package Pattern.Hard;

import java.util.Scanner;

public class Seven {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n value");
        int n = sc.nextInt();
        for(int row=1; row<=n; row++){
            //spaces
            for(int col=1; col<=n-row; col++){
                System.out.print("  ");
            }
            //numbers
            for(int col=1; col<=row; col++){
                System.out.print(col + " ");
            }
            //decreasing
            for(int col=row-1; col>=1; col--){
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
