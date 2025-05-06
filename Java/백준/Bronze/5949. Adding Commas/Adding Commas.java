import java.util.*;
import java.math.*;
import java.text.NumberFormat;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		NumberFormat nf = NumberFormat.getInstance();
		System.out.println(nf.format(n));
	}
}