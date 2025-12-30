package LeetCodeHard;

import java.util.Scanner;

public class ConvertatoA {

    public static char convert(char name){
        return (char) (name - 'a'+'A');
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        System.out.println(convert(ch));
    }
}
