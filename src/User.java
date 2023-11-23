public class User {
    private String name;

    private int age;

    private static User user;

    public static User getUser(){
        if(user == null){
            user = new User();
        }
        return user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void printAgeAndName(User user){
        System.out.println("Name: " +user.getName() +"; Age: " +user.getAge());
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
