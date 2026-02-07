import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    //   HYPOTENUSE c = Math.sqrt(a^2 + b^2);
        Scanner scanner = new Scanner(System.in);
        double a;
        double b;
        double c;
        System.out.println(" ---- The Hypotenuse ----");

        System.out.print("Enter a length of side A : ");
        a = scanner.nextDouble();

        System.out.print("Enter a length of side B : ");
        b = scanner.nextDouble();

        c = Math.sqrt(Math.pow(a , 2) + Math.pow(b , 2 ));

        System.out.print("\nThe hypotenuse (side c) is : " + c);

        System.out.println(" \n---- Circumference , Area and Volume ---- ");

        double radius;
        double circumference;
        double area;
        double volume;
        System.out.print("\nEnter the radius : ");
        radius = scanner.nextDouble();

        circumference = 2 * Math.PI * radius;
        area = Math.PI * Math.pow(radius, 2);
        volume = (4.0 / 3.0) * Math.PI * Math.pow(radius , 3);

        System.out.printf("\nThe circumference is : %.2f cm" , circumference);
        System.out.printf("\nThe area is : %.2f cm^2 ", area);
        System.out.printf("The volume is %.2f cm^3", volume);

        scanner.close();
    }
}
