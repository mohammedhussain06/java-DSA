public class variousOperator {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // Arithmetic Operators
        System.out.println("Addition: " + (a + b)); // 30
        System.out.println("Subtraction: " + (a - b)); // -10
        System.out.println("Multiplication: " + (a * b)); // 200
        System.out.println("Division: " + (b / a)); // 2
        System.out.println("Modulus: " + (b % a)); // 0

        //Unary Operators
        int num = 5;
        System.out.println("Post-increment: " + (num++)); // 5
        System.out.println("After post-increment: " + num); // 6
        num = 5; // reset c
        System.out.println("Pre-increment: " + (++num)); // 6 

        // Relational Operators
        System.out.println("Is a equal to b? " + (a == b)); // false
        System.out.println("Is a not equal to b? " + (a != b)); // true
        System.out.println("Is a greater than b? " + (a > b)); // false
        System.out.println("Is a less than b? " + (a < b)); // true

        // Logical Operators
        boolean x = true;
        boolean y = false;
        System.out.println("Logical AND: " + (x && y)); // false
        System.out.println("Logical OR: " + (x || y)); // true
        System.out.println("Logical NOT: " + (!x)); // false

        // Assignment Operators
        int c = 5;
        c += 10; // c = c + 10
        System.out.println("After += operator: " + c); // 15

        c *= 2; // c = c * 2
        System.out.println("After *= operator: " + c); // 30

        c /= 3; // c = c / 3
        System.out.println("After /= operator: " + c); // 10

        c -= 4; // c = c - 4
        System.out.println("After -= operator: " + c); // 6

    }
}