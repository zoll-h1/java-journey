package Java;
import java.util.Scanner;
public class Input {
    public static void main(String[] args) {
    // Create an object for scanner
    try (Scanner scanner = new Scanner(System.in)) {
    // ask something 
    System.out.println("Enter your age : ");
    // read the data
    int age = scanner.nextInt(); // Считать целое число
    // String name = scanner.next();  // Считать одно слово
    // String line = scanner.nextLine(); // Считать всю строку
    
    // Use 
    System.out.println("You are " + age + " years old. ");
    System.out.println("Bye!");
    }
    

    }
}
