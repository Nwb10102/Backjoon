import java.util.*;
import java.math.*;

public class Main
{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int coin = sc.nextInt();
    int price = sc.nextInt();

    if(coin * 100 >= price){
      System.out.println("Yes");
    }else System.out.println("No");
  }
}