public class typeConversion {
    public static void main(String[] args) {
        // This program demonstrates type conversion in Java.
        // We will convert between different data types and display the results.

        // Implicit type conversion (widening)
        int intValue = 100;
        double doubleValue = intValue; // int is automatically converted to double
        System.out.println("Implicit Type Conversion:");
        System.out.println("Integer value: " + intValue);
        System.out.println("Converted to double: " + doubleValue);

        // Explicit type conversion (narrowing)
        double anotherDoubleValue = 9.99;
        int anotherIntValue = (int) anotherDoubleValue; // double is explicitly converted to int
        System.out.println("\nExplicit Type Conversion:");
        System.out.println("Double value: " + anotherDoubleValue);
        System.out.println("Converted to integer: " + anotherIntValue);

        // String to integer conversion
        String numberString = "123";
        int parsedInt = Integer.parseInt(numberString); // converting string to integer
        System.out.println("\nString to Integer Conversion:");
        System.out.println("String value: " + numberString);
        System.out.println("Parsed integer: " + parsedInt);

        // Integer to string conversion
        int num = 456;
        String numString = Integer.toString(num); // converting integer to string
        System.out.println("\nInteger to String Conversion:");
        System.out.println("Integer value: " + num);
        System.out.println("Converted to string: " + numString);
    }
}
