public class MyClass {
    public static void main(String args[]) {
      int num=10;

      System.out.println("The arithmetic multiplication table for 'num' is");
      multTable(num);
    }
    
    public static void multTable(int x){
        
//        for(int i=1; i<=x; i++){            //Righe sbagliate
//            for(int j=1; j<=x; j++){
//                System.out.print(i*j +" ");
//            }
//            System.out.println();
//        }

        for(int i = 0; i <= 10; i++){
            System.out.println(i+"*"+x +"=" +i*x);
        }
    }
}
