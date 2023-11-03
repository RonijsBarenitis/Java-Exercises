public class Main {
    public static void main(String[] args) {

        double dividend = 10;
        double divisor = 0;

        System.out.println("This function will check if the divisor is 0. It will throw an error if it is");
        division(dividend, divisor);
    }

    public static void division(double a, double b){

        try{
            if(b == 0){
                throw new ArithmeticException("Can't divide by 0");
            } else {
                System.out.println("It is possible to divide those numbers");
            }
        } catch (ArithmeticException e){
            System.out.println("Error: " +e);
        }

    }
}