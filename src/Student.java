public class Student {

    private final String name;

    private final String surname;

    private final int idNumber;

    public Student(String name, String surname, int idNumber){
        this.name = name;
        this.surname = surname;
        this.idNumber = idNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", idNumber=" + idNumber +
                '}';
    }
}
