import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class RPSgame {
    public static void main(String[] args) {

        // ROCK PAPER SCISSORS GAME

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choice = {"rock", "paper", "scissors"};
        String playerChoice;
        String computerChoice;
        String playAgain = "yes";
            // GET CHOICE FROM THE USER
            System.out.println("--- WELCOME TO THE PAPER/ROCK/SCISSORS GAME \uEC17 ---");
        do {
            System.out.print("Enter your move (rock/paper/scissors): ");
            playerChoice = scanner.nextLine().toLowerCase();

            if (!playerChoice.equals("rock")
                    && !playerChoice.equals("paper")
                    && !playerChoice.equals("scissors")) {
                System.out.println("Invalid choice nigga");
                continue;
            }

            // GET RANDOM CHOICE FROM THE COMPUTER

            computerChoice = choice[random.nextInt(3)];
            System.out.println("Computer choice : " + computerChoice);

            // CHECK WIN CONDITIONS

            if (playerChoice.equals(computerChoice)) {
                System.out.println("It's a tie!");
            } else if ((playerChoice.equals("rock") && computerChoice.equals("scissors")) ||
                    (playerChoice.equals("paper") && computerChoice.equals("rock")) ||
                    (playerChoice.equals("scissors") && computerChoice.equals("paper"))) {
                System.out.println("You win \uE79F");
            } else {
                System.out.println("You lose \uE79F");
            }

            // ASK TO PLAY AGAIN ?
           System.out.println("Wanna play again \uEAD2 (yes/no)");
            playAgain = scanner.nextLine().toLowerCase();

        }while(playAgain.equals("yes"));
        //GOODBYE MESSAGE
        System.out.println("Thank you for playing ! \uEAF2");

    }
}
