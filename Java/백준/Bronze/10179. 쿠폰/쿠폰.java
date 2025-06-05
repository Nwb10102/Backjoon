import java.math.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for(int i = 0; i < n; i++) {
			double money = sc.nextDouble();
			money *= 0.8;

			System.out.println("$" + String.format("%.2f", money));
		}
	}
}