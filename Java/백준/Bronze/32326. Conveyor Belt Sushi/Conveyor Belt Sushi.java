import java.util.*;
import java.math.*;

public class Main
{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(); // red plate $3
    int a = sc.nextInt(); // green plate $4
    int b = sc.nextInt(); // blue plate $5
    System.out.println((n*3) + (a*4) + (b*5));
  }
}