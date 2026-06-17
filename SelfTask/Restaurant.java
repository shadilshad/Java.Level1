package SelfTask;
import java.util.Scanner;

class Menu {
    String name;
    int price;
    boolean isHeading;

    static String Website = "www.website.com";

    Menu(String n) {
        name = n;
        isHeading = true;
    }

    Menu(String n, int p) {
        name = n;
        price = p;
        isHeading = false;
    }

    void display() {
        if (isHeading) {
            System.out.println("\n" + name);
        } else {
            System.out.println(name + " : " + price + " Rs");
        }
    }

    static void details() {
        System.out.println("\n-- FREE DELIVERY --");
        System.out.println("+1234567890");
        System.out.println(Website);
    }
}

public class Restaurant {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean running = true;
        int total = 0;

        Menu[] mainCourse = {
            new Menu("--- MAIN COURSE ---"),
            new Menu("1: Fried Rice", 220),
            new Menu("2: Chicken Steak", 160),
            new Menu("3: Spicy Chicken", 330),
            new Menu("4: Grilled Salmon Fish", 280),
            new Menu("5: Chicken Shawarma", 120)
        };

        Menu[] appetizers = {
            new Menu("--- APPETIZERS ---"),
            new Menu("1: Avocado Toast", 280),
            new Menu("2: Spaghetti Pasta", 300),
            new Menu("3: Chicken Pie", 320),
            new Menu("4: Fish Sandwich", 180),
            new Menu("5: Vegetable Salad", 90)
        };

        Menu[] drinks = {
            new Menu("--- DRINKS ---"),
            new Menu("1: Mineral Water", 40),
            new Menu("2: Jasmine Tea", 50),
            new Menu("3: Lemonade", 50),
            new Menu("4: Fresh Juice", 140),
            new Menu("5: Smoothie", 160)
        };

        do {
            System.out.println("\nChoose Category:");
            System.out.println("1 - MAIN COURSE");
            System.out.println("2 - APPETIZERS");
            System.out.println("3 - DRINKS");

            int choice = sc.nextInt();
            Menu[] selectedMenu = null;

            switch (choice) {
                case 1:
                    selectedMenu = mainCourse;
                    break;
                case 2:
                    selectedMenu = appetizers;
                    break;
                case 3:
                    selectedMenu = drinks;
                    break;
                default:
                    System.out.println("Invalid choice!");
                    continue;
            }

            for (Menu item : selectedMenu) {
                item.display();
            }

            Menu.details();

            System.out.println("\nEnter item number (0 to stop ordering):");

            while (true) {
                int order = sc.nextInt();

                if (order == 0) break;

                if (order >= 1 && order <= 5) {
                    total += selectedMenu[order].price;
                    System.out.println(" Added: " + selectedMenu[order].name);
                } else {
                    System.out.println(" Invalid item");
                }
            }

            System.out.println("\nCurrent Total: " + total + " Rs");

            System.out.println("\nDo you want to continue? (yes/no)");
            String again = sc.next();

            if (again.equalsIgnoreCase("no")) {
                running = false;
            }

        } while (running);

        System.out.println("\n Final Bill: " + total + " Rs");
        System.out.println("Thank you for visiting!");

        sc.close();
    }
}