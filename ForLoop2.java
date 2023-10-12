public class MyClass {
    public static void main(String args[]) {
      int numOrigin=100;
      int numOps=5;

      System.out.println("Natural numbers in inverse order from 'numOrigin' printed 'numOps' times");
      inverseNumList(numOrigin, numOps);
    }
    
    public static void inverseNumList(int x, int y){
        
        for(int i=y; i>0; i--){
            System.out.print(x+" ");
            x--;
        }
    }
}
