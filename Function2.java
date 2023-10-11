public class MyClass {
    public static void main(String args[]) {
      String myString = "This is a string 36 characters long.";

      System.out.println("Length of myString = " + lengthOf(myString));
    }
    
     public static int lengthOf(String a){
         int x = a.length();
         return x;
     }
}
