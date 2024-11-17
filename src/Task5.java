import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class Task5 {
    public static void main(String[] args) {
        System.out.println("5. Task 5: ");
        TreeMap<Integer, Integer> set = new TreeMap<>();
        set.put(1, 0);
        set.put(2, 6);
        set.put(3, 5);
        set.put(4, 4);
        set.put(5, 2);

        int keyGiven = 3;
        System.out.println("a) Print key-value pairs from a TreeMap where the keys are smaller than a " +
                "given key (int key) passed as a parameter.");
        for(Map.Entry<Integer, Integer> elements: set.entrySet()){
            if(elements.getKey() < keyGiven){
                System.out.println(elements.getKey() + " -> " + elements.getValue());
            }
        }

        System.out.println("b) Represent the keys of the TreeMap using a TreeSet, and print them.");
        TreeSet<Integer> treemapKeys = new TreeSet<>(set.keySet());
        System.out.println(treemapKeys);

        System.out.println("c) Delete all elements from the TreeMap.");
        set.clear();
        System.out.println(set);
    }
}
