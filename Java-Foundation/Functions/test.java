
import java.util.*;

public class test {

    //avg of three numbers
    public static void avg(int a, int b, int c) {
        int sum = a + b + c;
        int avg = sum / 3;
        System.out.println("Average: " + avg);
    }

    //Write a method named isEven that accepts an int argument. The method should return true if the argument is even, or false otherwise. Also write a program to test your method.
    public static boolean isEven(int num) {
        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    //To check if a number is palindrome or not
    public static boolean isPalindrome(int num) {
        int og = num;
        int rev = 0;
        while (num > 0) {
            int rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }
        if (og == rev) {
            return true;
        } else {
            return false;
        }
    }

    //sum of the digits of a number
    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            int rem = num % 10;
            sum = sum + rem;
            num = num / 10;
        }
        return sum;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        avg(a, b, c);

        System.out.print("Enter a number to check if it is even: ");
        int num = sc.nextInt();
        if (isEven(num)) {
            System.out.println(num + " is even.");
        } else {
            System.out.println(num + " is odd.");
        }

        System.out.print("Enter a number to check if it is palindrome: ");
        int palNum = sc.nextInt();
        if (isPalindrome(palNum)) {
            System.out.println(palNum + " is a palindrome.");
        } else {
            System.out.println(palNum + " is not a palindrome.");
        }

        System.out.print("Enter a number to find the sum of its digits: ");
        int sumNum = sc.nextInt();
        System.out.println("Sum of digits of " + sumNum + " is: " + sumOfDigits(sumNum));

        sc.close();
    }
}
