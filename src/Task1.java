import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("1. Task 1:");
        System.out.println("Create a HashMap and fill it with values");
        HashMap <Integer, String> set1 = new HashMap<>();
        set1.put(1, "Desk");
        set1.put(2, "Chair");
        set1.put(3, "Sofa");
        set1.put(4, "Rug");
        System.out.println("b) Print the elements of the map as key -> value.");
        for (Map.Entry elements: set1.entrySet()){
            System.out.println(elements.getKey() + "->" + elements.getValue());
        }
        System.out.println("c) Print the size of the map.");
        System.out.println("Size of the map is: " + set1.size());
    }
}
