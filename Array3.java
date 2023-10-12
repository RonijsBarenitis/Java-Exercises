import java.util.Arrays;  //Line 1 and line 13 implement a function to sort a given array, because the logic in this programm won't work for unsorted arrays
public class MyClass{
       
    public static void main (String[] args) {
        
        int arr[] = {15,12,1,2,3,1,2,3,4,5,6,12,6,4,5,7,8,8,9,9,10};
        
        System.out.println("The array before removing duplicates");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] +" ");
        }
        
        Arrays.sort(arr); 
        
        int length = arr.length;  
        length = removeDup(arr, length); 
        System.out.println("\nThe array after removing duplicates");
        for (int i = 0; i < length; i++)  
           System.out.print(arr[i]+" ");  
    }
    
    public static int removeDup(int arr[], int n){
         
        int[] tempArr = new int[n];  
        int j = 0;  
        for (int i = 0; i < n-1; i++){
            if (arr[i] != arr[i+1]){
                tempArr[j++] = arr[i];  
            }  
         }  
        tempArr[j++] = arr[n-1];      
        for (int i = 0; i < j; i++){
            arr[i] = tempArr[i];  
        }  
        
        return j;  
    }  
}
