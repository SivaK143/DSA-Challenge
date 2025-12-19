package Maths;

import java.util.Scanner;

public class SumOfNaturalNumbers {

    private static int sumOfSquareNaturalNumbers(int n)
    {
        int sum = 0;
        for(int i =1; i<=n; i++)
        {
            sum = sum + i*i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n");
        int sum = 0;
        int n = sc.nextInt();
        //(n*(n+1))/2
        for(int i = 1; i<=n; i++){
            sum = sum + i;
        }
        System.out.println(sum);

        System.out.println(sumOfSquareNaturalNumbers(2));
    }
}
