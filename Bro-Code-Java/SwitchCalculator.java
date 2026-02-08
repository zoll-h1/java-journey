import java.util.Scanner;

public class SwitchCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            double num1;
            double num2;
            String operator;
            boolean validOperation = true;
            double result = 0.0;

            System.out.println(" ---- Switch Calculator ---- ");

            System.out.print("Enter the num1 : ");
            num1 = scanner.nextDouble();

            System.out.print("Enter the operator (+, -, *, /, ^) : ");
            operator = scanner.next();

            System.out.print("Enter the num2 : ");
            num2 = scanner.nextDouble();

            switch(operator) {
                case "+" -> result = num1 + num2;
                case "-" -> result = num1 - num2;
                case "*" -> result = num1 * num2;
                case "/" -> {
                    if(num2 == 0) {
                        System.out.print("Can't be divided by zero");
                        validOperation = false;
                    }else {
                        result = num1 / num2;
                    }
                }
                case "^" -> result = Math.pow(num1, num2);
                default -> {
                    System.out.println("Invalid operator");
                    validOperation = false;
                }
            }
            if(validOperation) {
                System.out.printf("The result : %.1f" , result);
            }
        scanner.close();
    }
}
