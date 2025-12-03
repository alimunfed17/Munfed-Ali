import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter the number to generate the pattern: ");
        int number = keyboard.nextInt();

        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            for (int i = 1; i <= number; i++) {
                System.out.print((2 * i - 1));
                if (i < number) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }

        keyboard.close();
    }
}
