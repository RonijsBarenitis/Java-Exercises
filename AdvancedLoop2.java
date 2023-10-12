public class MyClass {
    public static void main(String args[]) {
      int num=10;

      System.out.println("List of numbers from 0 to 'num', if value 5 is reached, it will be omitted");
      numList(num);
    }
    
    public static void numList(int x){
        
        for(int i=0; i<=x; i++){
            
            if(i==5){
                continue;
            }
            System.out.print(i+" ");
            
        }
    }
}
