package Maths;

import java.util.Scanner;

public class primeNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n");
        int n = sc.nextInt();
        if(n < 2){
            System.out.println("Not a prime number");
            return;
        }else{
            for(int i = 2; i<n; i++){
                if(n % i == 0) {
                    System.out.println("Not a prime number");
                    return;
                }
            }
            System.out.println("Prime number");
        }
    }
}
