import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {
    public static void main(String[] args) {

        OffsetDateTime date = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        System.out.println("Date before any modifications: " +date);
        System.out.println("Date before any modifications, localized for Italy: " +returnLocalizedDateUnmodified(date));

        OffsetDateTime dateModified = date.plusYears(1).minusMonths(1).plusDays(7);

        System.out.println("Date after the modifications, localized for Italy: " +returnLocalizedDateModified(dateModified));
    }

    public static String returnLocalizedDateUnmodified(OffsetDateTime date){
        if(date == null) {
            return null;
        }
        return date.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM));
    }

    public static String returnLocalizedDateModified(OffsetDateTime dateModified){
        if(dateModified == null) {
            return null;
        }
        return dateModified.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM));
    }
}