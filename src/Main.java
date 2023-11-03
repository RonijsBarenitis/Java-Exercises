public class Main {
    public static void main(String[] args) {

        Integer numerator = null;
        Integer denominator = 0;

        controlForNull(numerator, denominator);
    }

    public static void controlForNull(Integer a, Integer b){
        try{
            if((a == null) || (b == null)){
                throw new Exception("a value has been assigned \"null\"");
            }
        } catch (Exception e){
            System.out.println("Error, " +e);
        }
    }
}