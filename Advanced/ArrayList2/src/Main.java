import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Jake Morrow", 20);
        Student student2 = new Student("Robert Harris", 19);
        Student student3 = new Student("Astrid Lake", 22);
        Student student4 = new Student("Julia Cooper", 20);
        Student student5 = new Student("John Doe", 25);
        Student student6 = new Student("Nicole Tomassi", 28);
        Student student7 = new Student("Catherine Gerbi", 22);
        Student student8 = new Student("Mike Aurelius", 30);
        Student student9 = new Student("Luke Duke", 31);
        Student student10 = new Student("Silvia Fortebraccio", 33);
        Student student11 = new Student("Arthur Berzer", 18);
        Student student12 = new Student("Anna Kalinina", 27);

        List<Student> students = new ArrayList<Student>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);
        students.add(student7);
        students.add(student8);
        students.add(student9);
        students.add(student10);
        students.add(student11);
        students.add(student12);

        System.out.println("Name of student6: " +student6.getName());
        System.out.println("Age of student6: " +student6.getAge());

        System.out.println("The unsorted ArrayList\n" +students);

        students.sort(Comparator.comparing(Student::getName)); //Sorting by name in alphabetical order

        System.out.println("The sorted ArrayList by names\n" +students);


    }
}