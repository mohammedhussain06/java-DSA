
import java.util.*;

public class parameterized {

    public static void add(int num1, int num2) {
        int sum = num1 + num2;
        System.out.println("The sum is: " + sum);
    }

    //multiplication of two numbers
    public static int multiply(int num1, int num2) {
        int product = num1 * num2;
        return product;
    }

    //factorial of a number
    public static int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    //binomial coefficient nCr
    public static long binCoeff(int n, int r) {
        long factN= factorial(n);
        long factR= factorial(r);
        long factNR= factorial(n-r);
        long result = factN / (factR * factNR);
        return result;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the numbers: ");
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        //add(a, b);
        
        // int result = multiply(a, b);
        // System.out.println("The product is: " + result);
        
        // System.out.print("Enter the number: ");
        // int n = sc.nextInt();
        // int result = factorial(n);
        // System.out.println("The factorial is: " + result);

        System.out.print("Enter n and r: ");
        int n = sc.nextInt();
        int r = sc.nextInt();
        long result = binCoeff(n, r);
        System.out.println("The binomial coefficient is: " + result);

        sc.close();
    }
}
