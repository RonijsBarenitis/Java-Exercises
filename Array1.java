public class MyClass {
    public static void main(String args[]) {
      
      System.out.print("Sum of all the numbers in the array: ");
      sumArr();
      
    }
    
    public static void sumArr(){
        
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        int sum = 0;
        for(int i=0; i < array.length; i++){
            sum+=array[i];
        }
        System.out.println(sum);
    }
}
