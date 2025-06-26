import java.math.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            numbers[i] = a;
        }
        int count = 0;
        int v = sc.nextInt();
        for(int i = 0; i < n; i++){
            if(numbers[i] == v){
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}