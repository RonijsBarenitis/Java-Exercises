public class Main {
    public static void main(String[] args) {

        //Esercizio già svolto e correto scelto: java Basics -> Le basi del linguaggio Java -> Arrays1

        Integer[] array = {1,2,3,4,5,6,7,8,9,10};
        System.out.print("Sum of all the numbers in the array: " +sumArr(array));
    }

    public static Integer sumArr(Integer[] arr){

        if (arr == null){
            return null;
        }

        Integer sum = 0;
        for(int i=0; i < arr.length; i++){
            sum+=arr[i];
        }
        return sum;
    }

}