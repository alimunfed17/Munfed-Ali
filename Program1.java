import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        while(true) {
            System.out.println("Enter the first nubmer: ");
            double number1 = keyboard.nextDouble();
            keyboard.nextLine();

            System.out.println("Enter the second nubmer: ");
            double number2 = keyboard.nextDouble();
            keyboard.nextLine();

            System.out.print("Enter the operation (add, sub, multi, divide): ");
            String operation = keyboard.nextLine().trim().toLowerCase();

            double result;
            switch(operation) {
                case "add":
                    result = addition(number1, number2);
                    System.out.println("Result: " + result);
                    break;
                case "sub":
                    result = subtraction(number1, number2);
                    System.out.println("Result: " + result);
                    break;
                case "multi":
                    result = multiplication(number1, number2);
                    System.out.println("Result: " + result);
                    break;
                case "divide":
                    if (number2 == 0) {
                        System.out.println("Error: Division by zero! Cannot divide" + number1 + "by 0.");
                        continue;
                    } else {
                        result = division(number1, number2);
                        System.out.printf("Result: " + result);
                    }
                    break;
                default:
                    System.out.println("Invalid operation. Please use: add, sub, multi, divide");
                    continue;
            }

            System.out.print("Do you wanna try another operation? (Y/N): ");
            String choice = keyboard.nextLine().trim().toUpperCase();

            if (!choice.equals("Y")) {
                System.out.println("Thank you for using the calculator!");
                break;
            }
        }
        
        keyboard.close();
    }

    public static double addition(double input1, double input2) {
        return input1 + input2;
    }

    public static double subtraction(double input1, double input2) {
        return input1 - input2;
    }

    public static double multiplication(double input1, double input2) {
        return input1 * input2;
    }

    public static double division(double input1, double input2) {
        return input1 / input2;
    }
}

