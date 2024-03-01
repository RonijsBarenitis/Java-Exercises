public class MyClass {
    public static void main(String args[]) {
      int num=5;

      System.out.println("The sum of all number from 1 to 'num' is " + numSum(num));
    }
    
    public static int numSum(int x){
        int ctrl=1;
        int sum=0;
        while(ctrl<=x){
            sum+=ctrl;
            ctrl++;
        }
        return sum;
    }
}
