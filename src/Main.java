import java.time.OffsetDateTime;

public class Main {
    public static void main(String[] args) {

        OffsetDateTime date = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        System.out.println("Date: " +date);

        System.out.println("Printing only the year: " +returnYear(date));

        System.out.println("Printing only the month: " +returnMonth(date));

        System.out.println("Printing only the day: " +returnDay(date));

        System.out.println("Printing only the day of the week: " +returnDayOfWeek(date));
    }

    public static String returnYear(OffsetDateTime date){
        if(date == null) {
            return null;
        }
            return String.valueOf(date.getYear());
    }

    public static String returnMonth(OffsetDateTime date){
        if(date == null) {
            return null;
        }
        return String.valueOf(date.getMonth());
    }

    public static String returnDay(OffsetDateTime date){
        if(date == null) {
            return null;
        }
        return String.valueOf(date.getDayOfMonth());
    }

    public static String returnDayOfWeek(OffsetDateTime date){
        if(date == null) {
            return null;
        }
        return String.valueOf(date.getDayOfWeek());
    }
}