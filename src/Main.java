import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<String> fruits = new LinkedList<>();

        fruits.add("Strawberry");
        fruits.add("Blueberry");

        System.out.println("LinkedList of fruits:\n" +fruits);

        fruits.addFirst("Apple");
        fruits.addLast("Avocado");

        System.out.println("LinkedList of fruits after adding an element in the first and last position:\n" +fruits);
    }
}