import java.math.*;
import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int first = sc.nextInt();
    int second = sc.nextInt();
    int third = sc.nextInt();

    ArrayList<Integer> arr = new ArrayList<Integer>();
    arr.add(first); arr.add(second); arr.add(third);
    Collections.sort(arr);
    System.out.println(arr.get(1));
  }
}