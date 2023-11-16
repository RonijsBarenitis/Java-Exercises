import java.time.OffsetDateTime;

public class Main {
    public static void main(String[] args) {

        OffsetDateTime date1 = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        System.out.println("Date1: " +date1);
        OffsetDateTime date2 = OffsetDateTime.parse("2024-03-01T13:00:00Z");
        System.out.println("Date2: " +date2);

        System.out.println("Is date1 before date2? "+date1.isBefore(date2));
        System.out.println("Is date2 after date1? "+date2.isAfter(date1));
        System.out.println("Do these dates have the same hour? " +date1.compareTo(date2));
    }
}