import java.util.Random;
import java.util.Scanner;

public class slotMachine {
    public static void main(String[] args) {
        // JAVA SLOT MACHINE
        Scanner scanner = new Scanner(System.in);
        // Declare variables
        int balance = 100;
        int bet;
        int payout;
        String[] row;
        String playAgain;

        // Display Welcome message
        System.out.println("----------------------------");
        System.out.println("Welcome to Java Slots Machine");
        System.out.println("----------------------------");
        System.out.println("Symbols :\"\uD83C\uDF4B\", \"\uD83C\uDF4A\", \"\uD83C\uDF52\", \"\uD83C\uDF53\"");
        System.out.println("----------------------------");

        // Play if balance > 0;
        while(balance > 0) {
            System.out.println("Current Balance : $" + balance);
            System.out.print("Place your bet amount: ");
        // Enter the bet amount
            bet = scanner.nextInt();
            scanner.nextLine();
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
        // Get payout
            payout = getPayout(row, bet);

            if(payout > 0) {
                System.out.println("You won : " + "$" + payout);
                balance += payout;
            }
            else {
                System.out.println("You lost!");
            }
            System.out.print("Do you wanna play again ? (Y/N): ");
            playAgain = scanner.nextLine().toUpperCase();

        // Ask to play again
            if(!playAgain.equals("Y")) {
                break;
            }
        }

        // Display an exit message
        System.out.println("GAME OVER! Your final balance : $" + balance);
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
    static int getPayout(String[] row, int bet) {

        if (row[0].equals(row[1]) && row[1].equals(row[2])) {
            return switch (row[0]) {
                case "🍋" -> bet * 3;
                case "🍊" -> bet * 4;
                case "🍒" -> bet * 5;
                case "🍓" -> bet * 10;
                default -> 0;
            };
        }
        else if (row[0].equals(row[1])) {
            return switch (row[0]) {
                case "🍋" -> bet * 2;
                case "🍊" -> bet * 3;
                case "🍒" -> bet * 4;
                case "🍓" -> bet * 5;
                default -> 0;
            };
        }
        else if (row[1].equals(row[2])) {
            return switch (row[1]) {
                case "🍋" -> bet * 2;
                case "🍊" -> bet * 3;
                case "🍒" -> bet * 4;
                case "🍓" -> bet * 5;
                default -> 0;
            };
        }
        return 0;
    }
}
