import java.util.Scanner;

public class shop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        char currency = '$';
        double total;

        System.out.println(" ---- Welcome to the shopping cart ---- ");
        System.out.print("What do you wanna buy ?: ");
        item = scanner.nextLine();

        System.out.print("What is the price for each ?: ");
        price = scanner.nextDouble();

        System.out.print("How many would you like ?: ");
        quantity = scanner.nextInt();

        System.out.print("You buy : " + item + " | " + " Each one is : " + price + " | Quantity : " + quantity);

        total = price * quantity;

        System.out.println("\nYour total : " + total);
        System.out.println(" ---- Goodbye! ----");
        scanner.close();
    }

}
