class RotateColumnBy90 {
 public static void rotateBy90(int mat[][]){
   int n = mat.length;
   //transpose the matrix
   for(int i = 0; i < n; i++){
    for(int j = i; j < n; j++){
     int temp = mat[i][j];
     mat[i][j] = mat[j][i];
     mat[j][i] = temp;
    }
   }
  //swap first row with last row
   for(int i = 0; i < n; i++){
    for(int j = 0; j < n/2; j++){
       int temp = mat[i][j];
       mat[i][j] = mat[i][n-1-j];
       mat[i][n-1-j] = temp;
    }
   }
  }
  public static void main(String[] args){
   int mat[][]={{1,2,3},{4,5,6},{7,8,9}};
   rotateBy90(mat);
   for(int i = 0; i < mat.length; i++){
    for(int j = 0; j < mat[0].length; j++){
     System.out.print(mat[i][j] + " ");
    }
    System.out.println();
   }
  }
 }