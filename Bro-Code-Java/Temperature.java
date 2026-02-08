import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double temp;
        double newTemp;
        String unit;

        System.out.print("Enter the temperature : ");
        temp = scanner.nextDouble();

        System.out.print("Enter the unit (Farenheit or Celcius)? : ");
        unit = scanner.next().toUpperCase();

        newTemp = (unit.equals("C")) ? (temp - 32) * 5 / 9 : (temp * 5 / 9) + 32;

        System.out.printf("The new temperature is : %.1f\uEB05%s" , newTemp, unit);

        scanner.close();
    }

}
