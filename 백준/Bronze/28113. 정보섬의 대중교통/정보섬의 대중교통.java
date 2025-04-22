import java.util.*;
public class Main
{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(); //걸어가는 시간
    int a = sc.nextInt(); //버스
    int b = sc.nextInt(); //지하철

    if(n <= b && b == a) {
      System.out.println("Anything");
    }else if(n <= b && b - a > 0) {
      System.out.println("Bus");
    }else {
      System.out.println("Subway");
    }
  }
}