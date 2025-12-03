import java.util.*;

public class Program4 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter numbers (space-separated, end with non-number): ");
        ArrayList<Integer> numbers = new ArrayList<>();
        
        while (keyboard.hasNextInt()) {
            numbers.add(keyboard.nextInt());
        }
        
        Map<Integer, Integer> counts = new HashMap<>();
        for (int i = 1; i <= 9; i++) {
            counts.put(i, 0);
        }
        
        for (int num : numbers) {
            for (int i = 1; i <= 9; i++) {
                if (num % i == 0) {
                    counts.put(i, counts.get(i) + 1);
                }
            }
        }
        
        System.out.print("{");
        for (int i = 1; i <= 9; i++) {
            System.out.print(i + ": " + counts.get(i));
            if (i < 9) System.out.print(", ");
        }
        System.out.println("}");
        
        keyboard.close();
    }
}
