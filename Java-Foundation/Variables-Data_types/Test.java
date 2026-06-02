import java.util.*;
public class Test {
    public static void main(String[] args) {
        //Avg of numbers
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number: ");
        int A = sc.nextInt();
        System.out.println("Enter another number: ");
        int B = sc.nextInt();
        System.out.println("Enter another number: ");
        int C = sc.nextInt();
        int sum = A + B + C;
        System.out.println("The sum of the three numbers is: " + sum);
        float average = sum / 3.0f;
        System.out.println("The average of the three numbers is: " + average);

        //Area of square
        System.out.println("Enter the side length of the square: ");
        double side = sc.nextDouble();
        double area = side * side;
        System.out.println("The area of the square is: " + area);

        //Outputting total cost of pen, pencil and eraser and also adding 18% GST to the total cost
        System.out.println("Enter the price of the pen: ");
        double penPrice = sc.nextDouble();
        System.out.println("Enter the price of the pencil: ");
        double pencilPrice = sc.nextDouble();
        System.out.println("Enter the price of the eraser: ");
        double eraserPrice = sc.nextDouble();
        double totalCost = penPrice + pencilPrice + eraserPrice;
        System.out.println("The total cost of the pen, pencil and eraser is: " + totalCost);
        double gst = totalCost * 0.18;
        double totalCostWithGST = totalCost + gst;
        System.out.println("The total cost including 18% GST is: " + totalCostWithGST);
    }
}
