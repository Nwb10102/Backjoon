import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      while(true){
        double a = sc.nextDouble();

        if(a == -1) break;

        double result = a*0.167;

        System.out.printf("Objects weighing " + "%.2f" + " on Earth will weigh " + "%.2f" + " on the moon.\n", a, result);
      }
    }
}