import java.util.*;
public class breakLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            if (number % 10 == 0) {
                break; // Exit the loop when the number is a multiple of 10
            }
        }
        System.out.println("You entered a multiple of 10. Exiting...");
    }
}
           