import java.util.Scanner;

public class SimpleBank {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        // Java Banking System for Beginners

        // Declare Variables
        double balance = 0.0;
        boolean isRunning = true;
        int choice;

        // Display menu
        while(isRunning) {
            System.out.println("-----------------------------------------");
            System.out.println("Welcome to the banking management system");
            System.out.println("-----------------------------------------");
            System.out.println("1. Show balance ");
            System.out.println("2. Deposit ");
            System.out.println("3. Withdraw ");
            System.out.println("4. Exit ");
            System.out.println("-----------------------------------------");

            // Get and process users choice
            System.out.print("Enter you choice (1-4): ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1 -> showBalance(balance);
                case 2 -> balance += deposit();
                case 3 -> balance -= withdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("Invalid choice nigga");

            }
        }
        System.out.println("Thank you for using our banking system \uEC04");
        scanner.close();
    }
    static void showBalance(double balance) {
        System.out.printf("Balance : %.2f\n" , balance);
    }
    static double deposit() {
        double amount;
        System.out.print("Enter the amount : ");
        amount = scanner.nextDouble();

        if(amount < 0) {
            System.out.println("Amount can't be negative!");
            return 0;
        } else {
            return amount;
        }
    }
    static double withdraw(double balance) {
        double amount;
        System.out.print("Enter the amount : ");
        amount = scanner.nextDouble();

        if(amount > balance) {
            System.out.println("You broke , don't enough money");
            return 0;
        }
        else if(amount < 0) {
            System.out.println("Amount can't be negative");
            return 0;
        }
        else {
            return amount;
        }
    }
  }
