public class MyClass {
    public static void main(String args[]) {
      int num1 = 30;
      int num2 = 25;

      System.out.println("The result of myFunc " + myFunc(num1,num2));
    }
    
     public static int myFunc(int a, int b){
         a +=10;
         b +=5;
         return a*b;
     }
}
