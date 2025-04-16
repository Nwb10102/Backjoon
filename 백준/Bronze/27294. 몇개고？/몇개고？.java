import java.util.*;
import java.math.*;

public class Main
{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
    int Sull = sc.nextInt();
    boolean threehundred = false;
    
    if(h >= 12 && h <= 16 && Sull == 0){
      threehundred = true;
    }

    if(threehundred){
      System.out.println("320");
    }else System.out.println("280");
  }
}