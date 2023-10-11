public class MyClass {
    public static void main(String args[]) {
      char a='&';
      System.out.println(isAlgebricOp(a));
    }
    
    public static String isAlgebricOp(char x){
        String operator="";
        switch(x){
            case '+':
                operator = "Addition";
                break;
            case '-':
                operator = "Subtraction";
                break;
            case '*':
                operator = "Multiplication";
                break;
            case '/':
                operator = "Division";
                break;
            default:
                operator = "Error, not an elgebric operator";
                break;
        }
        return operator;
    }
}
