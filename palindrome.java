package Loops;

import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Write the number:");
        num = sc.nextInt();
        int original = num ;
        int reverse = 0;

        while(num != 0){
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }
        if ( original == reverse){
            System.out.println("Its palindrome");
        }
        else{
            System.out.println("It is not palindrome!");
        }

        sc.close();
    }
}
