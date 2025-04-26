import java.math.*;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int hol = 0,jjak = 0;
    for(int i = 0; i < n; i++){
      int a = sc.nextInt();
      if(a % 2 == 0){
        hol++;
      }else jjak++;
    }

    if(hol > jjak){
      System.out.println("Happy");
    }else System.out.println("Sad");
  }
}