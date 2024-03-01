public class MyClass {
    public static void main(String args[]) {
      
      int[][] matrix = {{1,2,3},{5,6,7}};
      
      System.out.println("The original matrix\n");
      for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
        
      System.out.println("\nThe  matrix after swapping rows with columns\n");
      swapMatrix(matrix);

    }
    
    public static void swapMatrix(int[][] a){
        
        int newMatrix[][] = new int[3][2];
        
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                newMatrix[j][i] = a[i][j];
            }
        }
        for(int i = 0; i < newMatrix.length; i++){
            for(int j = 0; j < newMatrix[i].length; j++){
                System.out.print(newMatrix[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
