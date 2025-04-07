import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int H = sc.nextInt();
    int M = sc.nextInt();

    int T = sc.nextInt();

    for(int i = 0; i < T; i++){
      M++;
      if(M >= 60){
        M = 0;
        H++;
      }
      if(H >= 24){
        H = 0;
      }
    }

    System.out.println(H + " " + M);
  }
}