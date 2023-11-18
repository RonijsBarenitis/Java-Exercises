import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        OffsetDateTime date1 = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        System.out.println("Date1: " +date1);

        OffsetDateTime date2 = OffsetDateTime.parse("2024-03-01T13:00:00Z");
        System.out.println("Date2: " +date2);

        ZonedDateTime dateNow = ZonedDateTime.now();
        System.out.println("The time now is: " +dateNow.toLocalDateTime());

        System.out.println("Is date1 before date2? "+date1.isBefore(date2));
        System.out.println("Is date2 after date1? "+date2.isAfter(date1));

        boolean date1ComparedToNow = date1.equals(dateNow.toLocalDateTime());
        boolean date2ComparedToNow = date2.equals(dateNow.toLocalDateTime());

        System.out.println("Is date1 the same as this moment in time? " +date1ComparedToNow);
        System.out.println("Is date2 the same as this moment in time? " +date2ComparedToNow);

    }
}