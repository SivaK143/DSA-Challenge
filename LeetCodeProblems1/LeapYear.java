package LeetCodeProblems1;

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num%400 == 0){
            System.out.println("Leap Year");
        }else if(num%4==0 && num%100!=0){
            System.out.println("Leap Year");
        }else{
            System.out.println("Not a leap year");
        }
    }
}
