import java.math.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int D = 0;
        int P = 0;
        for(int i = 0; i < n; i++){
            if(D >= P + 2){
                break;
            }else if(P >= D + 2){
                break;
            }
            
            String str = sc.next();
            if(str.equals("D")){
                D++;
            }else{
                P++;
            }
        }
        System.out.println(D + ":" + P);
    }
}