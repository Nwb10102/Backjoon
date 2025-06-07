import java.math.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int firstmoney = sc.nextInt();
		int secondmoney = sc.nextInt();

		int sum = firstmoney + secondmoney;

		int chickenPrice = sc.nextInt();
		int doubleChicken = chickenPrice * 2;

		if (sum >= doubleChicken) {
			System.out.println(sum - doubleChicken);
		} else {
			System.out.println(sum);
		}

		sc.close();
	}
}