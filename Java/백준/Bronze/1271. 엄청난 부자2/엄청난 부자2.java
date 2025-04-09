import java.util.*;
import java.math.BigInteger;

  public class Main {
      public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          BigInteger first = sc.nextBigInteger();
          BigInteger second = sc.nextBigInteger();

          System.out.println(first.divide(second));
          System.out.println(first.remainder(second));
      }
  }