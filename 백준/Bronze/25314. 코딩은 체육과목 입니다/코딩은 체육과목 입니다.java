import java.util.*;
public class Main
{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    while(true){
      if(n < 1){
        break;
      }
      System.out.print("long ");
      n -= 4;
    }
    System.out.print("int");
  }
}
