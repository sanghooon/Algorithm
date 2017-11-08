/* Given an array of integers, calculate which fraction of its elements are positive, which fraction of its elements are negative, and which fraction of its elements are zeroes, respectively. Print the decimal value of each fraction on a new line. */
import java.text.DecimalFormat;
import java.util.Scanner;

class Main {

  public static void main(String[] args) {
    String pattern = "#.######";
    DecimalFormat df = new DecimalFormat(pattern);
    Scanner sc = new Scanner(System.in);
    double pos = 0; double neg = 0; double zero = 0;
    int n = sc.nextInt();
    int num;
    for(int i = 0; i < n; i++) {
      num = sc.nextInt();
      if(num > 0) {
        pos++;
      }
      else if(num < 0) {
        neg++;
      }
      else {
        zero++;
      }
    }
    System.out.println(df.format(pos/n));
    System.out.println(df.format(neg/n));
    System.out.println(df.format(zero/n));
    
  }

}
