import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        // Compound interest calculator
        try (Scanner scanner = new Scanner(System.in)) {

            double principal;
            double rate;
            int timesCompounded;
            int years;
            double amount;

            System.out.print(" ---- Welcome to the interest calculator ---- ");

            System.out.print("\nEnter the principal amount :");
            principal = scanner.nextDouble();

            System.out.println("Enter the rate (in %): ");
            rate = scanner.nextDouble() / 100;

            System.out.println("Enter the # of times compounded per year : ");
            timesCompounded = scanner.nextInt();

            System.out.println("Enter the number of years : ");
            years = scanner.nextInt();

            amount = principal * Math.pow(1 + rate / timesCompounded, timesCompounded * years);
            System.out.printf("The amount after %d years is %.2f",  years , amount);

        }
    }
}
