import java.math.*;
import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int S = sc.nextInt();

    if(A <= S){
      System.out.println(A/2);
    }else{
      System.out.println(S/2);
    }
  }
}