import java.math.*;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    
    int sum = sc.nextInt();

    if(n+m == sum){
      System.out.println("correct!");
    }else System.out.println("wrong!");
  }
}