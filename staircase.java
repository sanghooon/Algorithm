/* Observe that its base and height are both equal to , and the image is drawn using # symbols and spaces. The last line is not preceded by any spaces. n - r - 1 >= c */
import java.util.Scanner;

class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int r = 0; r < n; r++) {
      for(int c = 0; c < n; c++) {
        if( n - r - 1 > c) {
          System.out.print(" ");
        }
        else {
          System.out.print("#");
        }
      }
      System.out.println();
    }
    
  }

}
