import java.time.OffsetDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {
    public static void main(String[] args) {

        OffsetDateTime date = OffsetDateTime.parse("2002-03-01T13:00:00Z");
        System.out.println("Date: " +date);

        ZonedDateTime dateZoned = OffsetDateTime.parse("2002-03-01T13:00:00Z").toZonedDateTime();
        System.out.println("Date FULL: " +returnFullDate(dateZoned));

        System.out.println("Date MEDIUM: " +returnMediumDate(date));

        System.out.println("Date SHORT: " +returnShortDate(date));
    }

    public static String returnFullDate(ZonedDateTime dateZoned){
        if(dateZoned == null){
            return null;
        }
        return dateZoned.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL));
    }

    public static String returnMediumDate(OffsetDateTime date){
        if(date == null){
            return null;
        }
        return date.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM));
    }
    public static String returnShortDate(OffsetDateTime date){
        if(date == null){
            return null;
        }
        return date.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT));
    }
}