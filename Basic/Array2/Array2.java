public class MyClass {
    public static void main(String args[]) {
      
      System.out.println("All occurrences of the character 'a' will be printed bellow from the given array. In case there are none, it will return 0");
      charArr();
      
    }
    
    public static void charArr(){
        
        char[] array = {'a','b','c','d','e','a'};
        boolean hasA = false;
        for(int i=0; i < array.length; i++){
            if(array[i]=='a'){
                System.out.print(array[i]+" ");
                hasA = true;
            }
        }
        if(hasA==false){
            System.out.print("0");
        }
    }
}
