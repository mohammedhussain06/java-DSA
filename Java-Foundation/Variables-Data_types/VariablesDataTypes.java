public class VariablesDataTypes {

    public static void main(String[] args) {
        //VARIABLES
        int age = 25; //integer variable
        double price = 19.99; //double variable
        char grade = 'A'; //character variable
        boolean isJavaFun = true; //boolean variable
        
        //DATA TYPES
        String name = "John"; //String data type
        long population = 7800000000L; //long data type
        float pi = 3.14f; //float data type
        byte byteValue = 100; //byte variable

        //OUTPUT
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Price: $" + price);
        System.out.println("Grade: " + grade);
        System.out.println("Is Java fun? " + isJavaFun);
        System.out.println("World Population: " + population);
        System.out.println("Value of Pi: " + pi);
        System.out.println("Byte Value: " + byteValue);

        //Sum of two numbers
        int num1 = 10;
        int num2 = 20;
        int sum = num1 + num2;
        System.out.println("Sum of " + num1 + " and " + num2 +" is: " + sum);
    }
}