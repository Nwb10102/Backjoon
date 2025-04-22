import java.util.*;
import java.math.*;

public class Main
{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String str = sc.next();
    int count = 0;
    
    for(int i = 0; i < n; i++){
      char c = str.charAt(i);

      if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
        count++;
      }
    }
    System.out.println(count);
  }
}