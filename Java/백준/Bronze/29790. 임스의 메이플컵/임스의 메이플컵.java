import java.math.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        int UnionLv = sc.nextInt();
        int maxLv = sc.nextInt();
        int dd = 0;
        
        if(q >= 1000){
            dd++;
        }
        if(dd == 1){
            if(UnionLv >= 8000 || maxLv >= 260){
                dd++;
            }
        }

        if(dd == 2){
            System.out.println("Very Good");
        }else if(dd == 1){
            System.out.println("Good");
        }else System.out.println("Bad");
    }
}