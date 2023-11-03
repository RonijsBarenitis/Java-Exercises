import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set hashColours = returnHashSet();

        System.out.println("Elements of the HashSet \"colours\":\n" +hashColours);

        String colour = "White";

        hashColours.add(colour);

        System.out.println("Elements of the HashSet \"colours\" after adding an element:\n" +hashColours);
    }

    public static Set returnHashSet(){

        Set<String> colours = new HashSet<String>(Arrays.asList("Red", "Green", "Yellow", "Blue"));
        return colours;

    }

}