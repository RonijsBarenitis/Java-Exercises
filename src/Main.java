import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        OffsetDateTime date = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        System.out.println("Date: " +date);

        String date1 = String.valueOf(date.getYear());
        System.out.println("Printing only the year: " +date1);

        String date2 = String.valueOf(date.getMonth());
        System.out.println("Printing only the month: " +date2);

        String date3 = String.valueOf(date.getDayOfMonth());
        System.out.println("Printing only the day: " +date3);

        String date4 = String.valueOf(date.getDayOfWeek());
        System.out.println("Printing only the day of the week: " +date4);



//        String date1 = date.format(DateTimeFormatter.ofPattern("YYYY"));
//        System.out.println("Printing only the year: " +date1);
//
//        String date2 = date.format(DateTimeFormatter.ofPattern("MMMM"));
//        System.out.println("Printing only the month: " +date2);
//
//        String date3 = date.format(DateTimeFormatter.ofPattern("dd"));
//        System.out.println("Printing only the day: " +date3);
//
//        String date4 = date.format(DateTimeFormatter.ofPattern("EEEE"));
//        System.out.println("Printing only the day of the week: " +date4);
    }
}