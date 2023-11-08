import java.util.*;

public class Main {
    public static void main(String[] args) {

        Map<Integer, Character> intToCharHashMap = new HashMap<>();
        intToCharHashMap.put(2, 'C');
        intToCharHashMap.put(1, 'D');
        intToCharHashMap.put(4, 'A');
        intToCharHashMap.put(3, 'B');

        System.out.println("The original HashMap: " +intToCharHashMap);

        List<Character> valuesOfHashMap = new ArrayList<>(intToCharHashMap.values());
        System.out.println("The unsorted values of the original HashMap: " +valuesOfHashMap);
        Collections.sort(valuesOfHashMap);
        System.out.println("The sorted values of the original HashMap: " +valuesOfHashMap);




    }
}