
import java.util.*;

public class test {

    public static void main(String[] args) {
        //program to check if a number is positive or negative by taking input from user
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

        //To check if a person has fever or not 
        double temperature = 103.5;
        if (temperature > 100.4) {
            System.out.println("The person has a fever.");
        } else {
            System.out.println("The person does not have a fever.");
        }

        //Write a Java program to input week number (1-7) and print day of week name using switch case.
        System.out.print("Enter a week number (1-7): ");
        int weekNumber = sc.nextInt();
        String dayName;
        switch (weekNumber) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalid week number";
        }

        System.out.println("The day of the week is: " + dayName);
    }
}
