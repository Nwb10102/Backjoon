import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int fprice = sc.nextInt();
    int fsum = 0;

    int n = sc.nextInt();

    for(int i = 0; i < n; i++){
      int price = sc.nextInt();
      int num = sc.nextInt();

      fsum += price * num;
    }

    if(fprice == fsum){
      System.out.println("Yes");
    } else System.out.println("No");
  }
}