public class dowhileLoop {
    public static void main(String[] args) {
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= 5);
    }

    //Program to output the sum of first 10 natural numbers using do-while loop using no functions
    public static void sumOfNaturalNumbers() {
        int sum = 0;
        int i = 1;
        do {
            sum += i;
            i++;
        } while (i <= 10);
        System.out.println("The sum of first 10 natural numbers is: " + sum);
    }
}