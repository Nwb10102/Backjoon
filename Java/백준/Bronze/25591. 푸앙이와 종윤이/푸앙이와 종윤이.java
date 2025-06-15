import java.math.*;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();

    int a = 100 - A;
    int b = 100 - B;
    int c = 100 - (a + b);
    int d = a * b;

    int q = d / 100;
    int r = d % 100;

    System.out.printf("%d %d %d %d %d %d\n", a, b, c, d, q, r);
    System.out.printf("%d %d\n", c+q, r);
  }
}