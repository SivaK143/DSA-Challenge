package Maths;

import java.util.Scanner;

public class FactorialOfaNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        int temp = n;
        for(int i = n-1; i>=1; i--)
        {
            temp = temp * i;
        }
        System.out.println(temp);

        temp = 1;
        for(int i=1; i<=n; i++)
        {
            temp = temp * i;
        }
        System.out.println(temp);
    }
}
