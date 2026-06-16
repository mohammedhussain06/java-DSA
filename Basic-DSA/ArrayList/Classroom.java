import java.util.*;

public class Classroom {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<Boolean> list2 = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);

        int element = list.get(3);
        System.out.println(element);

        list.remove(3);
        System.out.println(list);

        list.set(2, 10);
        System.out.println(list);

        System.out.println(list.contains(1));
        System.out.println(list.contains(11));

        list.add(1, 9);
        System.out.println(list);

        System.out.println(list.size());

        //print the list 
        for (int i = 0; i < list.size(); i++) {
             System.out.print(list.get(i) + " ");
        }
        System.out.println();

        //reverse
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
}
 

//Operations on ArralList:
//Add Element  O(1)
//Get Element  O(1)
//Remove Element  O(n)
//Set Element at Index  O(n)
//Contains Element  O(n)
//Size of array 