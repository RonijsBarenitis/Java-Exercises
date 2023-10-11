public class MyClass {
    public static void main(String args[]) {
      int x=10;
      int y=25;

      System.out.println("Sum of x+y = " + sumOf(x,y));
      System.out.println("Sum of 99+15 = " + sumOf(99,15));
    }
    
     public static int sumOf(int a, int b){
         int c=a+b;
         return c;
     }
}
