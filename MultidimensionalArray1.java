public class MyClass {
    public static void main(String args[]) {
      
      int[][] matrix = {{1,5,9,10},{4,4,5,8}};
      
      System.out.println("The given matrix is");
      for(int i = 0; i < matrix.length; i++){
          for(int j = 0; j < matrix[i].length; j++){
              System.out.print(matrix[i][j]+" ");
          }
          System.out.println();
      }
      System.out.println("Sum of first row elements = " +sum(matrix));
    }
    
    public static int sum(int[][] m){
        int total = 0;
        int i = 0;
        for(int j = 0; j < m[i].length; j++){
            total += m[i][j];
        }
        return total;
    }
}
