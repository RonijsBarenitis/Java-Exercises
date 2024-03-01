public class MyClass {
    public static void main(String args[]) {
      double x = 100;
      double y = 440;
      double z = 620;

      System.out.println("The averege of x,y and z is " + average(x,y,z));
    }
    
     public static double average(double a, double b, double c){
         double d = (a+b+c)/3;
         return d;
     }
}
