public class MyClass {
    public static void main(String args[]) {
      int num1 = 30;
      int num2 = 30;
      System.out.println("The first number is "+num1);
      System.out.println("The second number is "+num2);
      System.out.println("Are these two numbers the same? " + areEqual(num1,num2));
    }
    
     public static boolean areEqual(int a, int b){
         boolean c = a==b;
         return c;
     }
}
