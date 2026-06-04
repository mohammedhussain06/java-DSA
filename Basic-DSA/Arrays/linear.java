
import java.util.*;

public class linear {

    //linear search
    public static int linearSearch(int number[], int key) {
        for (int i = 0; i < number.length; i++) {
            if (number[i] == key) {
                return i;
            }
        }
        return -1;
    }

    //largest in array 
    public static int largest(int number[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < number.length; i++) {
            if(largest < number[i]) {
                largest = number[i];
            }
        }
        return largest;
    }

    //Binary search 
    public static int binarySearch(int number[], int key) {
        int start = 0, end = number.length-1;
        while(start <= end) {
            int mid = (start + end) / 2;

            if(number[mid] == key) {
                return mid;
            }
            if(number[mid] < key) {
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }
        return -1;
    }

    //Reverse array 
    public static void reverseArray(int number[]) {
        int first = 0, last = number.length-1;
        while(first < last) {
            int temp = number[last];
            number[last] = number[first];
            number[first] = temp;
            first++;
            last--;
        }
    }

    //pairs in array
    public static void pairArray(int number[]) {
        int tp = 0;
        for (int i =0; i < number.length; i++) {
            int curr = number[i];
            for (int j = i + 1; j < number.length; j++) {
                System.out.print("(" + curr + "," + number[j] + ")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total pairs: " + tp);
    }

    //SUb array 
    public static void subArray(int number[]) {
        int ts = 0;
        for (int i = 0; i < number.length; i++) {
            int start = i;
            for (int j = i + 1; j < number.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {
                    System.out.print(k + " ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total subarrays: " + ts);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int number[] = {2, 4, 6, 8, 10, 12, 14};
        // int key = 10;

        // int index = linearSearch(number, key);
        // if (index == -1) {
        //     System.out.println("Not found");
        // } else {
        //     System.out.println("Key found at: " + index);
        // }

        // int number[] = {1, 2, 6, 3, 5};
        // int index = largest(number);
        // System.out.println("The largest number is: " + index);

        // int number[] = {2, 4, 6, 8, 10, 12, 14};
        // int key = 4;
        // System.out.println("Index for the key is: " + binarySearch(number, key));

        // int number[] = {2, 4, 6, 8, 10};
        // reverseArray(number);
        // for(int i = 0; i < number.length; i++) {
        //     System.out.print(number[i] + " ");
        // }
        // System.out.println();

        // int number[] = {2, 4, 6, 8, 10};
        // pairArray(number);

        // int number[] = {2, 4, 6, 8, 10};
        // subArray(number);
    }
}
