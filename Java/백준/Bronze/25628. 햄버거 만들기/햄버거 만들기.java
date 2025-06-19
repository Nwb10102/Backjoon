import java.math.*;
import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    StringBuilder sb = new StringBuilder();
    int bread = sc.nextInt();
    int patty = sc.nextInt();

    int answer = Math.min((bread/2), patty);
    sb.append(answer);
    System.out.println(answer);
  }
}