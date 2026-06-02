public class forLoop {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello, World! " + i);
        }

        //to print square pattern 
        int n = 5; // size of the square
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println(); // move to the next line after each row
        }

        //print reverse of a number
        int number = 12345;
        int reverse = 0; 
        for (int i = number; i > 0; i /= 10) {
            int digit = i % 10; 
            reverse = reverse * 10 + digit; 
        }   
        System.out.println("Reverse of " + number + " is: " + reverse);
    }
}