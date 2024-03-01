import java.time.Month;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {
    public static void main(String[] args) {

        OffsetDateTime date = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        System.out.println("[Before any modifications]\nThe year is: " +getYear(date));
        System.out.println("The month is: " +getMonth(date));
        System.out.println("The number of the day of the month: " +getDay(date));
        System.out.println("Date before any modifications, localized for Italy: " +returnLocalizedDateUnmodified(date) +"\n");

        OffsetDateTime dateModified = modifyDate(date);

        System.out.println("[After modifications]\nThe year is: " +getYear(dateModified));
        System.out.println("The month is: " +getMonth(dateModified));
        System.out.println("The number of the day of the month: " +getDay(dateModified));
        System.out.println("Date after the modifications, localized for Italy: " +returnLocalizedDateModified(dateModified));
    }

    public static String returnLocalizedDateUnmodified(OffsetDateTime date){
        if(date == null) {
            return null;
        }
        return date.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM));
    }

    public static OffsetDateTime modifyDate(OffsetDateTime date){
        date = date.plusYears(1).minusMonths(1).plusDays(7);
        return date;
    }
    public static int getYear(OffsetDateTime date){
        return date.getYear();
    }

    public static Month getMonth(OffsetDateTime date){
        return date.getMonth();
    }

    public static int getDay(OffsetDateTime date){
        return date.getDayOfMonth();
    }

    public static String returnLocalizedDateModified(OffsetDateTime dateModified){
        if(dateModified == null) {
            return null;
        }
        return dateModified.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM));
    }
}