import java.math.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			String input = sc.next();
			if (input.equals("0")) break;

			BigInteger n = new BigInteger(input);
			BigInteger fortyTwo = BigInteger.valueOf(42);

			if (n.mod(fortyTwo).equals(BigInteger.ZERO)) {
					System.out.println("PREMIADO");
			} else {
					System.out.println("TENTE NOVAMENTE");
			}
		}
	}
}