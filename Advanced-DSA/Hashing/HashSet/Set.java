
import java.util.*;
public class Set {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(4);
        set.add(2);
        set.add(1);

        set.remove(2);
        System.out.println(set);
        if (set.contains(2)) {
            System.out.println("Set contains");
        }

        if (set.contains(3)) {
            System.out.println("Set does not contains the element");
        }
        System.out.println(set.size());
        System.out.println(set.isEmpty());

        HashSet<String> cities = new HashSet<>();
        cities.add("Mumbai");
        cities.add("Noida");
        cities.add("Delhi");
        cities.add("Bengaluru");
        
        // Iterator it = cities.iterator();
        // while(it.hasNext()) {
        //     System.out.println(it.next());
        // }

        for (String city : cities) {
            System.out.println(city);
        }
    }
}