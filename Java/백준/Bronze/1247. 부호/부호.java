import java.math.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for(int i = 0; i < 3; i++){
			int a = sc.nextInt();
			BigInteger sum = new BigInteger("0");
			BigInteger zero = new BigInteger("0");

			for(int j = 0; j < a; j++){
				BigInteger n = sc.nextBigInteger();
				sum = sum.add(n);
			}

			if (sum.compareTo(zero) < 0) {
				System.out.println("-");
			} else if (sum.compareTo(zero) > 0) {
				System.out.println("+");
			} else {
				System.out.println("0");
			}
		}
	}
}