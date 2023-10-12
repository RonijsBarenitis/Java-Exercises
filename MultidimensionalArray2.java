public class MyClass {
    public static void main(String args[]) {
      
      int[][] matrix = {{1,2,3},{5,6,7}};
      inverseMatrix(matrix);

    }
    
    public static void inverseMatrix(int[][] a){
        int[][] newMatrix = {{},{}};
        
        System.out.println(a.length);
        for(int i = 0; i < a[i].length; i++){
            for(int j = 0; j < a.length; j++){
                newMatrix[i][j] = a[j][i];
            }
        }
        
        for(int i = 0; i < newMatrix.length; i++){
            for(int j = 0; j < newMatrix[i].length; j++){
                System.out.print(newMatrix[i][j]);
            }
            System.out.println();
        }
        
    }
}
