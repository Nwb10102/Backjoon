import java.util.*;
import java.math.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int currentscore = 0;
    int sumscore = 0;
    int n = sc.nextInt();

    for(int i = 0; i < n; i++){
      int correct = sc.nextInt();

      if(correct == 1){
        currentscore++;
        sumscore += currentscore;
      }else{
        currentscore = 0;
      }
    }

    System.out.println(sumscore);
  }
}