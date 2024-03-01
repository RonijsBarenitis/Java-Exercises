public class MyClass {
    public static void main(String args[]) {
      char char1 = 'A';
      char char2 = 'a';
      System.out.println("The first character is "+char1);
      System.out.println("The second character is "+char2);
      System.out.println("Are these two characters the same? " + areEqual(char1,char2));
    }
    
     public static boolean areEqual(char a, char b){
         boolean c = a==b;
         return c;
     }
}
