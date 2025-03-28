import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    while (true) {
      int n = sc.nextInt();
      int m = sc.nextInt();
      int z = sc.nextInt();

      if (n == 0 && m == 0 && z == 0) {
        break;
      }
      if (n * n + m * m == z * z) {
        System.out.println("right");
      } else if(n * n + z * z == m * m){
        System.out.println("right");
      } else if(m * m + z * z == n * n){
        System.out.println("right");
      } else System.out.println("wrong");
    }
    sc.close();
  }
}