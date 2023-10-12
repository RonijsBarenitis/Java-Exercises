public class MyClass {
    public static void main(String args[]) {
      int num=10;

      System.out.println("The arithmetic multiplication table up to 'num' is");
      multTable(num);
    }
    
    public static void multTable(int x){
        
        for(int i=1; i<=x; i++){
            for(int j=1; j<=x; j++){
                System.out.print(i*j +" ");
            }
            System.out.println();
        }
    }
}
