import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set hashColours = returnHashSet();
        System.out.println("Elements of the HashSet \"colours\":\n" +hashColours);

        String colour = "White";
        hashColours.add(colour);
        System.out.println("Elements of the HashSet \"colours\" after adding an element:\n" +hashColours);

        Iterator<String> iterator = hashColours.iterator();
        while(iterator.hasNext()){
            String element = iterator.next();
            if(element == colour){
                iterator.remove();
            }
        }
        System.out.println("Elements of the HashSet \"colours\" and removing object \"colour\" [" +colour +"] if it is present:\n" +hashColours);

        hashColours.clear();
        System.out.println("The final contents of the HashSet \"colours\" after emptying it: " +hashColours);


    }

    public static Set returnHashSet(){

        Set<String> colours = new HashSet<String>(Arrays.asList("Red", "Green", "Yellow", "Blue"));
        return colours;

    }

}