
public class test {

    public static void main(String[] args) {
        //Arithmetic Operators
        int num1 = 2, num2 = 5;
        int exp1 = (num1 * num2 / num1);
        int exp2 = (num1 * (num2 / num1));
        System.out.print(exp1 + " , ");
        System.out.print(exp2);

        //Relational Operators
        int a = 200, b = 50, c = 100;
        if (a > b && b > c) {
            System.out.println("Hello");
        }
        if (c > b && c < a) {
            System.out.println("Java");
        }
        if ((b + 200) < a && (b + 150) < c) {
            System.out.println("Hello Java");
        }

        //Asssignment Operators
        int x, y, z;
        x = y = z = 2;
        x += y;
        y -= z;
        z /= (x + y);
        System.out.println(x + " " + y + " " + z);
    }
}
