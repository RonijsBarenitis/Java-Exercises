public class MyClass {
    public static void main(String args[]) {
      int numDay=1;
      System.out.println(dayOfWeek(numDay));
    }
    
    public static String dayOfWeek(int a){
        String day="";
        switch(a){
            case 1:
                day = "Monday";
                break;
            case 2:
                day = "Tuesday";
                break;
            case 3:
                day = "Wednesday";
                break;
            case 4:
                day = "Thursday";
                break;
            case 5:
                day = "Friday";
                break;
            case 6:
                day = "Saturday";
                break;
            case 7:
                day = "Sunday";
                break;
            default:
                day = "Error, invalid number";
                break;
        }
        return day;
    }
}
