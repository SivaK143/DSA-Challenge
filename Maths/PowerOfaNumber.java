package Maths;

import java.util.Scanner;

public class PowerOfaNumber {

    public static void main(String[] args) {
        int temp = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value which we need to find power");
        int n = sc.nextInt();
        System.out.println("enter the power value");
        int x = sc.nextInt();
        for(int i=1; i<=x; i++){
            temp = temp * n;
        }
        System.out.println(temp);
    }
}
