import java.util.*;

public class Sets {
    public static void main(String[] args) {
        int arr[] = {7, 6, 9};
        int arr1[] = {6, 3, 9, 2, 9, 4};
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }
        System.out.print("Union Elements: ");
            for (int element : set) {
            System.out.print(element + " ");
        }       
        System.out.println("Union = " + set.size());

        //intersection
        set.clear();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        int count = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (set.contains(arr1[i])) {
                System.out.print(arr1[i] + " ");
                count++;
                set.remove(arr1[i]);
            }
        }
        System.out.println("Intersection = " + count);
    }
}
