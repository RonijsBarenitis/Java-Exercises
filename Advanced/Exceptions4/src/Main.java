public class Main {
    public static void main(String[] args) {

        int[] array = {10, 20, 30, 40};

        divideArr(array);
    }

    public static void divideArr(int[] arr){

        int index = 1;

        try{
            int valore = arr[index]/0;
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error, " +e);
        } catch (ArithmeticException e){
            System.out.println("Error, " +e);
        }

        System.out.println("Function completed");
    }
}