import java.util.Random;
import java.util.Scanner;

public class NumberGuess {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int guess;
        int attempts = 0;
        int min = 1;
        int max = 100;
        int randomNumber = random.nextInt(min , max);

        System.out.print("--- Welcome to the number guessing game --- \uEBA1 \n");
        System.out.printf("Guess number between %d - %d : \n" , min , max);

        do{
            System.out.print("Enter the guess \uEBAC ");
            guess = scanner.nextInt();
            attempts++;

            if(guess < randomNumber) {
                System.out.println("IT'S TOO LOW , TRY AGAIN! \uEAD2");
            }
            else if(guess > randomNumber) {
                System.out.println("IT;S TOO HIGH , TRY AGAIN! \uEAD2");
            }
            else {
                System.out.println("CORRECT \uEAB2");
                System.out.println("You have won \uEAF9 !");
                System.out.printf("The attempts is : %d \uEAF2 \n", attempts);
            }

        }while(guess != randomNumber);
        System.out.println("Thank you for playing , have a good day !!! \uEC04");
    }
}
