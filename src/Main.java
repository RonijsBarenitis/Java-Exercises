import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Jake Morrow", 20);
        Student student2 = new Student("Robert Harris", 19);
        Student student3 = new Student("Astrid Lake", 22);
        Student student4 = new Student("Julia Cooper", 20);

        List<Student> students = new ArrayList<Student>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);

        System.out.println("Name of student3: " +student3.getName());
        System.out.println("Age of student3: " +student3.getAge());

        System.out.println("The ArrayList with n elements (n=4 in this case)\n" +students);

        Student student5 = new Student("John Doe", 25);
        Student student6 = new Student("Nicole Tomassi", 28);
        Student student7 = new Student("Catherine Gerbi", 22);
        Student student8 = new Student("Mike Aurelius", 30);

        students.add(student5);
        students.add(student6);
        students.add(student7);
        students.add(student8);

        System.out.println("The updated ArrayList with 4 added elements:\n" +students);


    }
}