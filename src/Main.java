public class Main {
    public static void main(String[] args) {

        User user1;
        user1 = User.getUser();
        User.printAgeAndName(user1);
        System.out.println("User 1: " +user1);

        User user2;
        user2 = User.getUser();
        user2.setName("Gallo");
        user2.setAge(33);
        User.printAgeAndName(user2);
        System.out.println("User 2: "+user2);
    }
}