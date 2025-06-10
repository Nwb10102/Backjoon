import java.math.*;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(); //치킨집 치킨 갯수

    int coke = sc.nextInt(); //콜라 갯수
    int beer = sc.nextInt(); //맥주 갯수

    int maxChicken = 0;

    maxChicken = (coke / 2) + beer;

    if(n <= maxChicken){
      System.out.println(n);
    }else System.out.println(maxChicken);
  }
}