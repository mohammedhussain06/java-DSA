
import java.util.*;

public class binaryDecimal {

    public static void binaryToDecimal(int binNum) {
        int pow = 0;
        int decNum = 0;
        while (binNum > 0) {
            int lastDigit = binNum % 10;
            decNum += lastDigit * Math.pow(2, pow);
            pow++;
            binNum /= 10;
        }
        System.out.println("Decimal equivalent: " + decNum);
    }

    public static void decimalToBinary(int n) {
        int pow = 0;
        int binNum = 0;
        while (n > 0) {
            int lastDigit = n % 2;
            binNum += lastDigit * Math.pow(10, pow);
            pow++;
            n /= 2;
        }
        System.out.println("Binary equivalent: " + binNum);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        int binNum = sc.nextInt();
        binaryToDecimal(binNum);

        System.out.print("Enter a decimal number: ");
        int decNum = sc.nextInt();
        decimalToBinary(decNum);

        sc.close();
    }
}
