import java.util.*;
public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of integers to read: ");
        int n = scanner.nextInt();
        int sumEven = 0;
        int sumOdd = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            int num = scanner.nextInt();
            if (num % 2 == 0) {
                sumEven += num;
            } else {
                sumOdd += num;
            }
        }
        System.out.println("Sum of even integers: " + sumEven);
        System.out.println("Sum of odd integers: " + sumOdd);

        //factorial of a number
        System.out.print("Enter a number to calculate its factorial: ");
        int num = scanner.nextInt();
        long factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of " + num + " is: " + factorial);

        //multiplication table for number N
        System.out.print("Enter a number to display its multiplication table: ");
        int n2 = scanner.nextInt();
        System.out.println("Multiplication table for " + n2 + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(n2 + " x " + i + " = " + (n2 * i));
        }   
    }
}