import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("3. Task 3: ");
        System.out.println("a) Create a clone of the HashMap.");
        HashMap<Integer, String> set = new HashMap<>();
        set.put(1, "Desk");
        set.put(2, "Chair");
        set.put(3, "Sofa");
        set.put(4, "Rug");

        //HashMap<Integer, String> setCloned = new HashMap<>(set);
        HashMap<Integer, String> setCloned = (HashMap<Integer, String>) set.clone();
        System.out.println(setCloned);

        System.out.println("b) Write a method that returns the elements of the cloned map as an ArrayList.");
        System.out.println("Here is the cloned list elements: " + clonedMap(setCloned));
    }
    public static ArrayList<String> clonedMap(HashMap<Integer, String> set){
        ArrayList<String> clonedMap = new ArrayList<>();
        for (Map.Entry<Integer, String> elements: set.entrySet()){
            clonedMap.add(elements.getKey() + "->" + elements.getValue());
        }
        return clonedMap;
    }
}
