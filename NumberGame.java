package Loops;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Number Game ---");
            System.out.println("1. Prime Check");
            System.out.println("2. Even/Odd");
            System.out.println("3. Reverse Number");
            System.out.println("4. Sum of Digits");
            System.out.println("5. Palindrome Check");
            System.out.println("6. Exit");

            System.out.print("Choose option: ");
            choice = sc.nextInt();

            System.out.print("Enter number: ");
            int num = sc.nextInt();

            switch (choice) {

                case 1:
                    boolean isPrime = true;
                    if (num <= 1) isPrime = false;
                    else {
                        for (int i = 2; i < num; i++) {
                            if (num % i == 0) {
                                isPrime = false;
                                break;
                            }
                        }
                    }
                    System.out.println(isPrime ? "Prime" : "Not Prime");
                    break;

                case 2:
                    System.out.println(num % 2 == 0 ? "Even" : "Odd");
                    break;

                case 3:
                    int rev = 0, temp = num;
                    while (temp != 0) {
                        int d = temp % 10;
                        rev = rev * 10 + d;
                        temp /= 10;
                    }
                    System.out.println("Reverse: " + rev);
                    break;

                case 4:
                    int sum = 0, t = num;
                    while (t != 0) {
                        sum += t % 10;
                        t /= 10;
                    }
                    System.out.println("Sum: " + sum);
                    break;

                case 5:
                    int r = 0, original = num;
                    while (num != 0) {
                        int d = num % 10;
                        r = r * 10 + d;
                        num /= 10;
                    }
                    System.out.println(original == r ? "Palindrome" : "Not Palindrome");
                    break;

                case 6:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 6);

        sc.close();
    }
}