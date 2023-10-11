public class MyClass {
    public static void main(String args[]) {
      String myString = "aaaaaaaaaaa";
      if(myString.length()>10){
          System.out.println("Lunghezza maggiore di 10");
      }
      else if(myString.length()<10){
          System.out.println("Lunghezza minore di 10");
      }
      else if(myString.length()==10){
          System.out.println("Lunghezza pari a 10");
      }
    }
}
