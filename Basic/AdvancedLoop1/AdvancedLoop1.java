public class MyClass {
    public static void main(String args[]) {
      int num=10;

      System.out.println("List of numbers from 0 to 'num', printed to maximum of 5");
      numList(num);
    }
    
    public static void numList(int x){
        
        for(int i=0; i<=x; i++){
            System.out.print(i+" ");
            if(i==5){
                break;
            }
            
        }
    }
}
