import java.math.*;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int time = n/5;
    if(n%5 == 0){
      System.out.println(time);
    }else{
      System.out.println(time+1);
    }
  }
}