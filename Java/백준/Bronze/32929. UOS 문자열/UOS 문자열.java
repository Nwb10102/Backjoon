import java.util.*;
import java.math.*;

public class Main
{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int nah = n % 3;
    switch(nah){
      case 1:
        System.out.println("U");
        break;
      case 2:
        System.out.println("O");
        break;
      default: System.out.println("S"); break;
    }
  }
}