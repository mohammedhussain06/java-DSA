import java.util.*;

public class Classroom {
    public static void swap(ArrayList<Integer> list, int idx1, int idx2) {
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<Boolean> list2 = new ArrayList<>();

        //multidimensional arraylist
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(1); lista.add(2);
        mainList.add(lista);
        ArrayList<Integer> listb = new ArrayList<>();
        listb.add(1); listb.add(2);
        mainList.add(listb);
        for(int i=0; i<mainList.size(); i++) {
            ArrayList<Integer> currList = mainList.get(i);
            for(int j=0; j<currList.size(); j++) {
                System.out.print(currList.get(j)+ " ");
            }
            System.out.println();
        }

        list.add(2);
        list.add(5);
        list.add(9);
        list.add(6);
        list.add(8);

        int idx1 = 1, idx2 = 3;
        System.out.println(list);
        swap(list, idx1, idx2);
        System.out.println(list);
        // Collections.sort(list);
        // System.out.println(list);
        // Collections.sort(list, Collections.reverseOrder());
        // System.out.println(list);
        // System.out.println(list);

        // int element = list.get(3);
        // System.out.println(element);

        // list.remove(3);
        // System.out.println(list);

        // list.set(2, 10);
        // System.out.println(list);

        // System.out.println(list.contains(1));
        // System.out.println(list.contains(11));

        // list.add(1, 9);
        // System.out.println(list);

        // System.out.println(list.size());

        // print the list 
        // for (int i = 0; i < list.size(); i++) {
        //      System.out.print(list.get(i) + " ");
        // }
        // System.out.println();

        // reverse
        // for (int i = list.size() - 1; i >= 0; i--) {
        //     System.out.print(list.get(i) + " ");
        // }
        // System.out.println();

        // max element
        // int max = Integer.MIN_VALUE;
        // for (int i = 0; i < list.size(); i++) {
        //     if (max < list.get(i)) {
        //         max = list.get(i);
        //     }
        // }
        // System.out.println("Largest element is: " + max);
    }
}
 

//Operations on ArralList:
//Add Element  O(1)
//Get Element  O(1)
//Remove Element  O(n)
//Set Element at Index  O(n)
//Contains Element  O(n)
//Size of array 