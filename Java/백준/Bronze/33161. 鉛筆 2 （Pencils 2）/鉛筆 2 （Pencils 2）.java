import java.util.*;
import java.math.*;

public class Main
{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int pen = 0;
      while(true){
        if(n <= 4){
          break;
        }
        n = n - 5;
        pen ++;
      }
      System.out.println(pen);
    }
  }