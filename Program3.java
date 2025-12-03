import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter the number to generate the pattern: ");
        int number = keyboard.nextInt();
        
        int limit = (number % 2 == 0) ? number - 1 : number;
        int elements = (limit * 2) - 1; 
        
        for (int i = 1; i <= elements; i += 2) {
            System.out.print(i);
            if (i < elements) {
                System.out.print(", ");
            }
        }
        
        System.out.println();
        keyboard.close();
    }
}
