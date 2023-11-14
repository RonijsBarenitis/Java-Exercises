import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<Fruit> fruits = new LinkedList<>();

        fruits.add(new Fruit("Strawberry"));
        fruits.add(new Fruit("Blueberry"));

        System.out.println("LinkedList of fruits:\n" +fruits);

        fruits.addFirst(new Fruit("Apple"));
        fruits.addLast(new Fruit("Avocado"));

        System.out.println("LinkedList of fruits after adding an element in the first and last position:\n" +fruits);
    }
}