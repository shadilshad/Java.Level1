package SelfTask;
import java.util.Scanner;

public class Primenumbergame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Play your prime number game! Are you ready? (YES/NO): ");
        String answer = sc.nextLine();

        if (answer.equalsIgnoreCase("yes")) {

            boolean playAgain = true;

            do {
                System.out.print("Enter a number: ");
                int pri = sc.nextInt();

                boolean isPrime = true;

                if (pri <= 1) {
                    isPrime = false;
                } else {
                    for (int i = 2; i < pri; i++) {
                        if (pri % i == 0) {
                            isPrime = false;
                            break;
                        }
                    }
                }

                if (isPrime) {
                    System.out.println("It's a prime number!");
                } else {
                    System.out.println("It's not a prime number!");
                }

                System.out.print("Do you want to play again? (yes/no): ");
                sc.nextLine(); 
                String play = sc.nextLine();

                if(play.equalsIgnoreCase("yes")){
                    playAgain = true;
                }
                else if(play.equalsIgnoreCase("No")){
                    System.out.println("It was nice playing with you!");
                    break;
                }
                else{
                    System.out.println("invalid Action!");
                }



            } while (playAgain);

        } else {
            System.out.println("See you next time!");
        }

        sc.close();
    }
}