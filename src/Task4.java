import java.util.Map;
import java.util.TreeMap;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("4. Task 4");
        System.out.println("a) Create a TreeMap collection and fill it with values.");
        TreeMap<Integer, String> set1 = new TreeMap<>();
        set1.put(1, "Blue");
        set1.put(2, "Red");
        set1.put(3, "Navy");
        set1.put(4, "Black");
        System.out.println("b) Print the first and last elements of the TreeMap collection.");
        System.out.println(set1.firstEntry());
        System.out.println(set1.lastEntry());
        System.out.println("c) Print the keys of this collection in reverse order.");
        for (Map.Entry elements: set1.descendingMap().entrySet()){
            System.out.println(elements.getKey());
        }
    }
}
