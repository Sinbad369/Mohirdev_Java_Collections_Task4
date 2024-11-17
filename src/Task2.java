import java.util.HashMap;
import java.util.Map;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("2. Task 2: ");
        System.out.println("a) Merge two HashMap collections.");
        HashMap<Integer, String> set1 = new HashMap<>();
        set1.put(1, "Desk");
        set1.put(2, "Chair");
        set1.put(3, "Sofa");
        set1.put(4, "Rug");

        HashMap <Integer, String> set2 = new HashMap<>();
        set1.put(5, "Stool");
        set1.put(6, "Vase");
        set1.put(7, "Portrait");
        set1.put(8, "Coffee Machine");
        set1.putAll(set2);
        System.out.println("Merged map: " + set1);

        System.out.println("b) Write a method to print only the values of the merged map.");
        onlyValuesPrint(set1);

        System.out.println("c) Clear all the elements from these maps.");
        set1.clear();
        System.out.println(set1);
    }

    public static void onlyValuesPrint(HashMap<Integer, String> set){
        for (Map.Entry<Integer, String> elements: set.entrySet()){
            System.out.println(elements.getValue());
        }
    }
}
