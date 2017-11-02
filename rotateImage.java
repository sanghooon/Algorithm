/* You are given an n x n 2D matrix that represents an image. Rotate the image by 90 degrees (clockwise). */
class Main {

  public static void main(String[] args) {
    int[][] a = {{1,2,3},
                 {4,5,6},
                 {7,8,9}} ;
    int[][] b = rotateImage(a);
    printImage(b);
  }
  static int[][] rotateImage(int[][] a) {
    int n = a.length;
    int[][] b = new int[n][n];
    for(int r=0; r<n; r++) {
        for(int c=0; c<n; c++) {
            b[c][n-r-1] = a[r][c];
        }
    }
    return b;
  }
  static void printImage(int[][] a) {
    int n = a.length;
    for(int r=0; r<n; r++) {
      for(int c=0; c<n; c++) {
        System.out.print(a[r][c]);
      }
      System.out.println();
    }
  }

}
