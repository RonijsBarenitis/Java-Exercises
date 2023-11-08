import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        HashMap<Integer, String> intToString = new HashMap<>();
        intToString.put(1, "One");
        intToString.put(2, "Two");
        System.out.println("Hashmap one: " +intToString);

        Map<String, String> countryCapitalCity = new HashMap<>(Map.of("Italy", "Rome", "Latvia", "Riga"));
        System.out.println("Hashmap two: " +countryCapitalCity);

        Map<String, Integer> numOfPets = Map.ofEntries(
                new AbstractMap.SimpleEntry<>("Julia", 3),
                new AbstractMap.SimpleEntry<>("Marco", 2));
        System.out.println("Hashmap three: " +numOfPets);
    }
}