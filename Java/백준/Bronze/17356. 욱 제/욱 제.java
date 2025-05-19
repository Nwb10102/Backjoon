import java.math.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();

		double M = (b - a) / 400;
		double den = 1 + Math.pow(10, M);
		double result = 1 / den;

		System.out.println(result);
	}
}