import java.util.*;
public class Ifelse  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num > 0) {
            System.out.println(num + " is a positive number.");
        } else if (num < 0) {
            System.out.println(num + " is a negative number.");
        } else {
            System.out.println("The number is zero.");
        }

        //Program to check if adult can vote and drinok alcohol
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("You are an adult. You can vote and drink alcohol.");
        } else {
            System.out.println("You are not an adult. You cannot vote or drink alcohol.");
        }

        //Even or Odd
        System.out.print("Enter another number: ");
        int anotherNum = sc.nextInt();
        if (anotherNum % 2 == 0) {
            System.out.println(anotherNum + " is an even number.");
        } else {
            System.out.println(anotherNum + " is an odd number.");
        }

        //Income tax calculation
        System.out.print("Enter your annual income: ");
        double income = sc.nextDouble();
        double tax;
        if (income <= 50000) {
            tax = income * 0.1; // 10% tax
        } else if (income <= 100000) {
            tax = income * 0.2; // 20% tax
        } else {
            tax = income * 0.3; // 30% tax
        }
        System.out.println("Your income tax is: " + tax);

        //largest of three numbers
        System.out.print("Enter three numbers: ");
        int a = sc.nextInt();   
        int b = sc.nextInt();
        int c = sc.nextInt();   
        int largest;
        if (a >= b && a >= c) {
            largest = a;
        } else if (b >= a && b >= c) {
            largest = b;
        } else {
            largest = c;
        }   
        System.out.println("The largest number is: " + largest);

        sc.close();
    }
}