public class Main {
    public static void main(String[] args) {

        PersonBuilder builder1 = new PersonBuilder("Romeo", "Montague");
        builder1.setAge(16);
        builder1.setAddress("Verona");

        Person person1 = builder1.build();
        System.out.println("Person 1: " +person1);

        PersonBuilder builder2 = new PersonBuilder("Giulia", "Capulet");

        Person person2 = builder2.build();
        System.out.println("Person 2: " +person2);



    }
}