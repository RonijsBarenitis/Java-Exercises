import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set hashColours = returnHashSet();

        System.out.println("Size of the hashset: " +hashColours.size());

        System.out.println("Elements of the HashSet \"colours\":\n" +hashColours);
    }

    public static Set returnHashSet(){

        Set<String> colours = new HashSet<String>(Arrays.asList("Blue", "Red", "Green"));
        return colours;

    }
}