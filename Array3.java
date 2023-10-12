import java.util.Arrays;  //Line 1 and line 13 implement a function to sort a given array in ascending order, because the logic in this programm won't work for unsorted arrays
public class MyClass{
       
    public static void main (String[] args) {
        
        int arr[] = {11,10,10,9,1,1,2,3,4,4,4,1,4,1,19,5,10,11,12,13,14,14,16,3};
        
        System.out.println("The array before removing duplicates");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] +" ");
        }
        
        Arrays.sort(arr); 
        
        System.out.println("\nThe array after removing duplicates");
        removeDup(arr);  
    }
    
    public static void removeDup(int[] arr){
         
         for(int i = 0; i < arr.length; i++){
             
             if((i == arr.length-1) || (arr[i] != arr[i+1])){
                 System.out.print(arr[i] +" ");
             }
         }
          
    }  
}
