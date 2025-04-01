import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n1 = sc.nextInt();
        int k1 = sc.nextInt();
        int n2 = sc.nextInt();
        int k2 = sc.nextInt();
        
        int first = n1*k1;
        int eco = n2*k2;
        
        System.out.println(first + eco);
    }
}