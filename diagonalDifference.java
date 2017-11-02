/* Given a square matrix of size , calculate the absolute difference between the sums of its diagonals. */

import java.util.Scanner;

class Main {

  public static void main(String[] args) {
    // 11 2  4
    //  4 5  6
    // 10 8 -12
    
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[][] a = new int[n][n];

    for(int r = 0; r < n; r++) {
      for(int c = 0; c < n; c++) {
        a[r][c] = sc.nextInt();
      }
    }
    System.out.println(diagonalDifference(a));
    
  }
  
  static int diagonalDifference(int[][] a) {
    int n = a.length;
    int first = 0;
    int second = 0;
    for(int i=0;i<n;i++) {
      first += a[i][i];
    }
    for(int j=n-1; j>=0; j--) {
      second += a[n - j - 1][j];
    } 
    return Math.abs(first - second);
    
  }
}
