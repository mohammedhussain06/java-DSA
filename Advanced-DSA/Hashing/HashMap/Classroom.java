import java.util.*;
public class Classroom {
    public static void main(String[] args) {
        //create
        HashMap<String, Integer> hm = new HashMap<>();
        //insert
        hm.put("India", 100);
        hm.put("China", 50);
        hm.put("USA", 150);
        hm.put("Indonesia", 75);
        hm.put("Nepal", 80);
        System.out.println(hm);
        //get
        // int population = hm.get("India");
        // System.out.println(population);
        //containskey
        //System.out.println(hm.containsKey("India"));
        //remove
        // System.out.println(hm.remove("China"));
        // System.out.println(hm);
        //size
        //System.out.println(hm.size());
        //isempty
        //System.out.println(hm.isEmpty());
        //iterate
        Set<String> keys = hm.keySet();
        System.out.println(keys);
        for (String k : keys) {
            System.out.println("Keys = " + k + ",Values = " + hm.get(k));
        }
    }
}