import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double weight;
        double newWeight;
        int choice;

        System.out.println("---- Welcome to the converter ----");
        System.out.println(" 1 : lbs to kgs ");
        System.out.println(" 2 : kgs to lbs ");
        System.out.print("\nChoose from 2 option : ");

        choice = scanner.nextInt();

        if(choice == 1) {
            System.out.print("Enter the weight (lbs): ");
            weight = scanner.nextDouble();
            newWeight = weight * 0.453592;
            System.out.println("Converting...");
            System.out.printf("The new weigth is : %.2f " , newWeight);
        }
        else if(choice == 2) {
            System.out.print("Enter the weight (kgs): ");
            weight = scanner.nextDouble();
            newWeight = weight * 2.20462;
            System.out.println("Converting...");
            System.out.printf("The new weight is : %.2f " , newWeight);
        }
        else {
            System.out.println("Not a valid choice !!! ");
        }


        scanner.close();
    }
}
