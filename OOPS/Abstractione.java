package OOPS;
import java.util.Scanner;

// 🔹 ABSTRACTION using abstract class
abstract class Payment {
    abstract void pay(double amount);
}

// 🔹 UPI class
class UPI extends Payment {

    String upiId;

    UPI(String upiId) {
        this.upiId = upiId;
    }

    void pay(double amount) {
        System.out.println("Validating UPI ID: " + upiId);
        System.out.println("Processing UPI payment of ₹" + amount);
        System.out.println("UPI Payment Successful ✅");
    }
}

// 🔹 CARD class
class Card extends Payment {

    String cardNumber;

    Card(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    void pay(double amount) {
        System.out.println("Validating Card: " + cardNumber);
        System.out.println("Processing Card payment of ₹" + amount);
        System.out.println("Card Payment Successful ✅");
    }
}

// 🔹 MAIN CLASS
public class Abstractione {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter order amount:");
        double amount = sc.nextDouble();
        sc.nextLine();

        System.out.println("Choose payment method (upi/card): ");
        String choice = sc.nextLine();

        if (choice.equalsIgnoreCase("upi")) {
            System.out.println("Enter UPI ID:");
            String upiId = sc.nextLine();

            UPI u = new UPI(upiId);
            u.pay(amount);

        } else {
            System.out.println("Enter Card Number:");
            String card = sc.nextLine();

            Card c = new Card(card);
            c.pay(amount);
        }

        System.out.println("Order placed successfully 🚚");

        sc.close();
    }
}