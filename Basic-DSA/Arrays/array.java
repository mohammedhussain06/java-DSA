import java.util.*;
public class array {
    public static void update(int marks[]) {
        for (int i = 0; i < marks.length; i++) {
            marks[i] += 1; 
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        //int marks[] = new int[50];
        //int numbers[] = {1, 2, 3, 4, 5};
        // System.out.print("Enter the elements for array");
        // marks[0]= sc.nextInt();
        // marks[1]= sc.nextInt();
        // marks[2]= sc.nextInt();

        // System.out.println("Marks of phy: " + marks[0]);
        // System.out.println("Marks of chem: " + marks[1]);
        // System.out.println("Marks of maths: " + marks[2]);

        // int percentage = (marks[0] + marks[1] + marks[2]) / 3;
        // System.out.print("Percentage of the subjects: " + percentage + "%");

        int marks[] = {97, 98, 99};
        update(marks);
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " "); 
        }
        System.out.println();
    }
}