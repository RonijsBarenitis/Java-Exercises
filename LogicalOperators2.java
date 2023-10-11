public class MyClass {
    public static void main(String args[]) {
      int num = 100;
      
      System.out.println("Is the given number a pair number? " + isPair(num));
    }
    
     public static boolean isPair(int a){
         boolean b = a%2==0;
         return b;
     }
}
