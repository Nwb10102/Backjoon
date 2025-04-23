import java.math.*;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    boolean chun = false;
    boolean na = false;
    boolean yeoung = false;

    for(int i = 1; i <= 15; i++){
      for(int j = 1; j <= 15; j++){
        String str = sc.next();

        if(str.equals("w")){
          chun = true;
        } else if(str.equals("g")){
          yeoung = true;
        } else if(str.equals("b")){
          na = true;
        }
      }
    }

    if(chun){
      System.out.println("chunbae");
    }else if(yeoung){
      System.out.println("yeongcheol");
    }else System.out.println("nabi");
  }
}