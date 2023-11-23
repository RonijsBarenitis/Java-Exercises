import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {

        BigDecimal bigDec1 = BigDecimal.valueOf(10.99);
        BigDecimal bigDec2 = BigDecimal.valueOf(9.01);
        ArithmeticOperations operation = ArithmeticOperations.DIVISION;

        System.out.println("The first BigDecimal: " +bigDec1);
        System.out.println("The second BigDecimal: " +bigDec2);
        System.out.println("Operation to perform: " +operation);
        System.out.println("Result " +operationsOnBigDecimal(bigDec1, bigDec2, operation));
    }

    public static BigDecimal operationsOnBigDecimal(BigDecimal num1, BigDecimal num2, ArithmeticOperations op){

        if(op == ArithmeticOperations.ADDITION){
            return num1.add(num2);
        } else if (op == ArithmeticOperations.SUBTRACTION) {
            return num1.subtract(num2);
        } else if (op == ArithmeticOperations.MULTIPLICATION) {
            return num1.multiply(num2);
        } else if (op == ArithmeticOperations.DIVISION) {
            return num1.divide(num2, 2, RoundingMode.DOWN);
        } else if (op == ArithmeticOperations.MIN) {
            return num1.min(num2);
        } else if (op == ArithmeticOperations.MAX) {
            return num1.max(num2);
        } else {
            System.out.println("Something went wrong");
        }

        return BigDecimal.valueOf(0);
    }
}