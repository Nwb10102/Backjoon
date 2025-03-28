import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String str = sc.next();
    int k = sc.nextInt();
    System.out.println(str.charAt(k-1));
    sc.close();
  }
}