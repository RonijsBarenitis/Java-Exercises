public class MyClass {
    public static void main(String args[]) {
      int low = 10;
      int upp = 20;
      int control = 22;
      
      System.out.println("Lower number is "+low);
      System.out.println("Upper number is "+upp);
      System.out.println("Is the control number between lower and higher number? " + intervalControl(low,upp,control));
    }
    
     public static boolean intervalControl(int a, int b, int c){
         boolean d = c >= a && c <= 20;
         return d;
     }
}

