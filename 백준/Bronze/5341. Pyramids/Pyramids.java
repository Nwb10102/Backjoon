import java.util.*;
public class Main
{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while(true){
      int sum = 0;
      int n = sc.nextInt();

      if(n == 0){
        break;
      }

      for(int i = 0; i<=n; i++){
        sum += (n-i);
      }
      System.out.println(sum);
    }
    
  }
}