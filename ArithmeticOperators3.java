public class MyClass {
    public static void main(String args[]) {
      int num1 = 25;
      int num2 = 5;

      System.out.println("The result of myFunc " + myFunc(num1,num2));
    }
    
     public static int myFunc(int a, int b){
         a = ++a;
         b = b + 5;
         return a*b;
     }
}
