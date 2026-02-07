import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String email;
        String username;
        String domain;
        System.out.print("Enter your email : ");
        email = scanner.nextLine();
        if(email.contains("@")) {
            username = email.substring(0 , email.indexOf("@"));
            domain = email.substring(email.indexOf("@") + 1);
            System.out.printf("Your username is : %s " , username);
            System.out.printf("\nYour domain is : %s ", domain);
        }
        else {
            System.out.println("Your email in not valid ('@')");
        }
        scanner.close();

    }
}
