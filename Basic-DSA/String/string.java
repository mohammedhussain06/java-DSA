import java.util.Scanner;
public class string {
    public static void printLetter(String str) {
        for (int i =0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }

    public static String substring(String str, int si, int ei) {
        String substr = "";
        for (int i = si; i < ei; i++) {
            substr += str.charAt(i);
        }
        return substr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // char arr[] = {'a', 'b', 'c', 'd'};
        // String str = "xyz";
        // String str1 = new String("xyz");
        // String name;
        // name = sc.next();
        // System.out.println(name);
        // String fullName = "Tony Stark";
        // System.out.println(fullName.length());

        // String firstName = "Tony";
        // String lastName = "Stark";
        // String fullName = firstName + " " + lastName;  
        // printLetter(fullName);

        // String str = "HelloWorld";
        // System.out.println(substring(str, 0, 5));

        String fruits[] = {"apple", "mango", "banana"};
        String largest = fruits[0];
        for (int i = 0; i < fruits.length; i++) {
            if (largest.compareTo(fruits[i]) < 0 ) {
                largest = fruits[i];
            } 
        }
        System.out.println(largest);
    }
}