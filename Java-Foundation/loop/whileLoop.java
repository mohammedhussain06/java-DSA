public class whileLoop {
    public static void main(String[] args) {
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }

        //Print numbers from 1 to 10
        int j = 1;
        while (j <= 10) {
            System.out.println(j);
            j++;
        }

        //Sum of n natural numbers
        int n = 5;
        int sum = 0;
        int k = 1;
        while (k <= n) {
            sum += k;
            k++;
        }
        System.out.println("Sum of first " + n + " natural numbers is: " + sum);
    }
}