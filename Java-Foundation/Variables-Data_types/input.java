
import java.util.*;

public class input {

    public static void main(String[] args) {
        // This program demonstrates how to take user input in Java using the Scanner class.
        // We will read a string, an integer, and a double from the user and then display them.

        // Importing the Scanner class to read input from the user
        java.util.Scanner scanner = new Scanner(System.in);

        // Prompting the user for input
        System.out.print("Enter your name: ");
        String name = scanner.nextLine(); // Reading a string input

        System.out.print("Enter your age: ");
        int age = scanner.nextInt(); // Reading an integer input

        System.out.print("Enter your height in meters: ");
        double height = scanner.nextDouble(); // Reading a double input

        //input based addition of two numbers
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt(); // Reading first integer input
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt(); // Reading second integer input
        int sum = num1 + num2; // Calculating the sum of the two numbers
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum); // Displaying the sum

        //Product of two numbers
        System.out.print("Enter first number for product: ");
        int num3 = scanner.nextInt(); // Reading first integer input for product
        System.out.print("Enter second number for product: ");
        int num4 = scanner.nextInt(); // Reading second integer input for product
        int product = num3 * num4; // Calculating the product of the two numbers
        System.out.println("The product of " + num3 + " and " + num4 + " is: " + product); // Displaying the product

        //Area of circle
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble(); // Reading the radius input
        double area = Math.PI * radius * radius; // Calculating the area of the circle
        System.out.println("The area of the circle with radius " + radius + " is: " + area); // Displaying the area

        // Displaying the input back to the user
        System.out.println("Hello, " + name + "!");
        System.out.println("You are " + age + " years old.");
        System.out.println("Your height is " + height + " meters.");

        // Closing the scanner to prevent resource leaks
        scanner.close();
    }
}
