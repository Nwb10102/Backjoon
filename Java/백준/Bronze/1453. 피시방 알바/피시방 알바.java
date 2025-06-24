import java.math.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean[] check = new boolean[101];
        int n = sc.nextInt();

        int count = 0;
        for(int i = 0; i < n; i++){
            int a = sc.nextInt();
            if(check[a] == false){
                check[a] = true;
            }else{
                count++;
            }
        }
        System.out.println(count);
    }
}