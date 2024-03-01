import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        OffsetDateTime date = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        System.out.println("Date: " +date);

        System.out.println("Date in the requested format: " +returnDate(date));
    }

    public static String returnDate(OffsetDateTime date){
        if(date == null){
            return null;
        }
        return date.format(DateTimeFormatter.ofPattern("dd MMMM yyyy"));
    }
}