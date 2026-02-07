import java.util.Scanner;
class MAD {
    public static void main(String[] args) {
        // MAD LIBS GAME
        Scanner scanner = new Scanner(System.in);
        String place;
        String verb1;
        System.out.println("Enter a place : ");
        place = scanner.nextLine();

        System.out.println("Enter a verb1 : ");
        verb1 = scanner.nextLine();

        System.out.println("Today I was at " + place + " and this how my friends is trying " + verb1 + " his girlfriend");
        scanner.close();
    }
}