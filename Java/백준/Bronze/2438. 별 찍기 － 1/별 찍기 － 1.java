import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            for (int a = 1; a <= i; a++) {
                System.out.print("*");
            }
            System.out.println(); 
        }
        sc.close();
    }
}
