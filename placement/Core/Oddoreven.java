package placement;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Oddoreven{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("What's the number? ");
            int a = sc.nextInt();

            if (a % 2 == 0) {
                System.out.println("Even");
            } else {
                System.out.println("Odd");
            }

        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter an integer.");
        } finally {
            sc.close();
        }
    }
}