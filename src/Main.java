public class Main {
    public static void main(String[] args) {

        int num = 165;
        System.out.println("This function will check if a number is in the range between [10 - 20]");
        System.out.println("The value of num is: " +num);
        System.out.println("Is the number in the range? " +checkRange(num));
    }

    public static boolean checkRange(int a){

        try {
            if(a < 10 || a > 20) {
                throw new Exception("Number is out of bounds for the acceptable range");
            }
        } catch (Exception e) {
            System.out.println("Error: " +e);
            return false;
        }
        return true;
    }
}