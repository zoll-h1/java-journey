import java.util.Random;
import java.util.Scanner;

public class slotMachine {
    public static void main(String[] args) {
        // JAVA SLOT MACHINE
        Scanner scanner = new Scanner(System.in);
        // Declare variables
        int balance = 1000;
        int bet;
        int payout;
        String[] row;

        // Display Welcome message
        System.out.println("----------------------------");
        System.out.println("Welcome to Java Slots Machine");
        System.out.println("Symbols :\"\uD83C\uDF4B\", \"\uD83C\uDF4A\", \"\uD83C\uDF52\", \"\uD83C\uDF53\"");

        // Play if balance > 0;
        while(balance > 0) {
            System.out.println("Current Balance : $" + balance);
            System.out.print("Place your bet amount: ");
        // Enter the bet amount
            bet = scanner.nextInt();
        // Verify if bet > balance
            if(bet > balance) {
                System.out.println("You broke nigga, don't do this \uEAC9 ");
                continue;
            }
        // Verify bet > 0;
            else if(bet <= 0) {
                System.out.println("Must bu greater than zero");
                continue;
            }
            else {
        // Subtract bet from balance
                balance -= bet;
            }
            System.out.println("Spinning...");
        // Spin row
            row = spinRow();
            printRow(row);


        }



        // Get payout

        // Ask to play again

        // Display a exit message
        scanner.close();
    }
    static String[] spinRow() {
        String[] symbols = {"🍋", "🍊", "🍒", "🍓"};
        String[] row = new String[3];
        Random random = new Random();
        // Print row

       for(int i = 0; i < 3; i++) {
           row[i] = symbols[random.nextInt(symbols.length)];

       }
        return row;
    }
    static void printRow(String[] row) {
        System.out.println("--------------");
        System.out.println(" " + String.join(" | " , row));
        System.out.println("--------------");
    }
}
