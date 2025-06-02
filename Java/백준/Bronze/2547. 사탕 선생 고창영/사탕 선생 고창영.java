import java.math.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		for (int i = 0; i < t; i++) {
				int n = sc.nextInt();
				BigInteger sum = new BigInteger("0");

				for (int j = 0; j < n; j++) {
						sum = sum.add(sc.nextBigInteger());
				}

				String reminder = 		String.valueOf(sum.remainder(BigInteger.valueOf(n)));
				if (reminder.equals("0")) System.out.println("YES");
				else System.out.println("NO");

		}
	}
}