import java.util.Scanner;

public class Statements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name;
        int age;
        boolean isBlack;

        System.out.println(" ---- Hello this is a Test ---- ");
        System.out.print("Enter your name : ");
        name = scanner.nextLine();

        System.out.print("Enter your age : ");
        age = scanner.nextInt();

        System.out.print(" Are you black (true/false) \uEAC6 : ");
        isBlack = scanner.nextBoolean();

        if(name.isEmpty()) {
            System.out.print("\nEnter your name please ! ");
        }
        else{
            System.out.print("\nYour name is : " + name);
        }
        if(age < 0 || age > 120) {
            System.out.print("\nPlease Enter a normal age ! ");
        }else {
            System.out.print("\nYou are " + age + " years old !");
        }
        if(isBlack) {
            System.out.print("\nBlack man hahaha , You are under arrest");
        }else {
        System.out.print("\nGood !");
      }
        scanner.close();
    }
}
